package org.example.sort.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

    public static int[] array = new int[]{5, 1, 2, 4, 3};

    @Test
    public void test() {
        RadixSort radixSort = new RadixSort();

        int[] radixSortArray = radixSort.sort(array);
        int[] expectedArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            assertEquals(radixSortArray[i], expectedArray[i]);
            System.out.println(radixSortArray[i]);
        }
    }
}