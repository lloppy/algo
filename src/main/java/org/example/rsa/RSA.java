package org.example.rsa;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {

    private BigInteger publicKey;
    private BigInteger privateKey;
    private BigInteger m;


    public RSA(int bitLength) {
        createKeys(bitLength);
    }

    // Метод для генерации ключей
    private void createKeys(int bitLength) {
        SecureRandom random = new SecureRandom();

        BigInteger p = new BigInteger(bitLength, random);
        Tools.print(p.toString());

        BigInteger q = new BigInteger(bitLength, random);
        Tools.print(q.toString());

        m = p.multiply(q);

        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        publicKey = new BigInteger("65537"); // Общее значение для e
        privateKey = publicKey.modInverse(phi); // Генерация приватного ключа
    }

    // Метод для шифрования строки
    public BigInteger encrypt(String message) {
        byte[] bytes = message.getBytes();
        BigInteger m = new BigInteger(bytes);
        return m.modPow(publicKey, this.m);
    }

    // Метод для расшифрования строки
    public String decrypt(BigInteger encryptedMessage) {
        BigInteger m = encryptedMessage.modPow(privateKey, this.m);
        return new String(m.toByteArray()); // Преобразование BigInteger в строку
    }

}
