package org.example.rsa;

import org.junit.Test;

import java.security.SecureRandom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyBigIntegerTest {

    @Test
    public void checkIsNumberSimple() {
        MyBigInteger myBigInteger = new MyBigInteger(30, new SecureRandom());

        String stringBigInteger = myBigInteger.toString();

        Integer intBibInteger = Integer.parseInt(stringBigInteger);

        assertTrue(isPrime(intBibInteger));
        assertFalse(isPrime(6));
    }


    private static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}