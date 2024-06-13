package org.example.rsa;

import java.math.BigInteger;

public class Checker {
    public static Boolean isNumberSimple(byte[] digitsArray) {
        if (digitsArray[digitsArray.length - 1] % 10 == 5
                || digitsArray[digitsArray.length - 1] % 10 == 0
                || digitsArray[digitsArray.length - 1] % 2 == 0)
            return false;

        StringBuilder stringBuilder = new StringBuilder();
        for (int num : digitsArray) {
            stringBuilder.append(Math.abs(num));
        }
        String numberStr = stringBuilder.toString();
        BigInteger number = new BigInteger(numberStr);

        return number.isProbablePrime(100);
    }
}

class ArrayMultiplier {
    public static int[] multiplyArrays(int[] array1, int[] array2) {

        return array1;
    }


    public static void main(String[] args) {
        int[] array1 = {10, 21};
        int[] array2 = {30, 2};
        int[] result = multiplyArrays(array1, array2);
        System.out.println("Результат умножения: " + result.toString());
    }
}
