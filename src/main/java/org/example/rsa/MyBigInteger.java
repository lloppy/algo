package org.example.rsa;

import org.example.sort.algorithms.red_black.Helper;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Написать класс, который содержит
 * целое число со знаком в виде массива однобайтовых элементов
 * <p>
 * Реализовать конструкторы, деструктор, перегрузить операции:
 * аддитивные (+, –),
 * мультипликативные (*, /, %),
 * сравнения (==, !=, <, >),
 * взятие обратного по заданному модулю
 **/
public class MyBigInteger {
    private byte[] digitsArray;
    private boolean isPositive;

    public MyBigInteger(){

    }

    public MyBigInteger(int bitLength, SecureRandom random) {
        if (bitLength <= 0) {
            throw new IllegalArgumentException("Bit length must be positive");
        }
        int numBytes = (bitLength + 7) / 8;

        byte[] randomBytes = new byte[numBytes];
        do {
            random.nextBytes(randomBytes);
        } while (!Checker.isNumberSimple(randomBytes));

        this.digitsArray = randomBytes;
        this.isPositive = random.nextBoolean();

        Tools.print(Arrays.toString(digitsArray));
        Tools.print("MyBigInteger simple number was created");
    }


    /*    // Перегрузка оператора сложения
        public MyBigInteger add(MyBigInteger other) {
            //TODO
            // Реализация сложения чисел
        }

        // Перегрузка оператора вычитания
        public MyBigInteger subtract(MyBigInteger other) {
            //TODO
            // Реализация вычитания чисел
        }

        // Перегрузка оператора умножения
        public MyBigInteger multiply(MyBigInteger other) {
            //TODO
            // Реализация умножения чисел
        }

        // Перегрузка оператора деления
        public MyBigInteger divide(MyBigInteger other) {
            //TODO
            // Реализация деления чисел
        }

        // Перегрузка оператора взятия остатка
        public MyBigInteger mod(MyBigInteger other) {
            //TODO
            // Реализация взятия остатка от деления чисел
        }

        // Перегрузка оператора сравнения ==
        public boolean equals(MyBigInteger other) {
            //TODO
            // Реализация сравнения чисел
        }

        // Перегрузка оператора сравнения !=
        public boolean notEquals(MyBigInteger other) {
            //TODO
            // Реализация сравнения чисел
        }

        // Перегрузка оператора сравнения <
        public boolean lessThan(MyBigInteger other) {
            //TODO
            // Реализация сравнения чисел
        }

        // Перегрузка оператора сравнения >
        public boolean greaterThan(MyBigInteger other) {
            //TODO
            // Реализация сравнения чисел
        }

        // Метод для взятия обратного числа по заданному модулю
        public MyBigInteger modInverse(MyBigInteger modulus) {
            //TODO
            // Реализация взятия обратного числа по заданному модулю
        }

        // Другие методы, необходимые для операций над BigInteger
    */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!isPositive) sb.append("-");

        StringBuilder stringBuilder = new StringBuilder();
        for (int num : digitsArray) {
            stringBuilder.append(Math.abs(num));
        }
        return stringBuilder.toString();
    }

    public MyBigInteger multiply(MyBigInteger q) {
        String firstNumberString = digitsArray.toString();
        String secondNumberString = q.digitsArray.toString();
        long maxLength = Math.max(firstNumberString.length(), secondNumberString.length());

        StringBuilder result = new StringBuilder();
        int bufferValue = 0;

        for (int i = 1; i < maxLength; i++) {
        }
        Tools.print(result.toString());
        return null;

    }

}

