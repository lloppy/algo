package org.example.rsa;

import java.io.*;
import java.math.BigInteger;

public class Tools {

    public static void main(String[] args) {
        RSA rsa = new RSA(10);

        String message = "Hello, RSA!";
        BigInteger encryptedMessage = rsa.encrypt(message);
        //String decryptedMessage = rsa.decrypt(encryptedMessage);

        System.out.println("Original: " + message);
        //System.out.println("Encrypted: " + encryptedMessage + "\n");
        //System.out.println("Decrypted: " + decryptedMessage);

        // Запись и чтение текстового файла
        try {
           // writeFile("encr.txt", encryptedMessage.toString());
            String encryptedFromFile = readFile("encr.txt");
            //System.out.println("Encrypted from file: " + encryptedFromFile);
        } catch (IOException e) {
            System.out.println("Tools main error occurred");
        }
    }

    public static String readFile(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("readFile error occurred");
        }
        return sb.toString();
    }

    public static void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
        } catch (IOException e) {
            System.out.println("writeFile error occurred");
        }
    }

    public static void print(String stringForPrint){
        System.out.println(stringForPrint);
    }
}
