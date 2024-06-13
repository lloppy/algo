package org.example.sort.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    public static int[] array = new int[]{3, 1, 0, 2, 5, 4};

    @Test
    public void sort() {
        InsertionSort insertionSort = new InsertionSort();

        int[] insertionSortArray = insertionSort.sort(array);
        int[] expectedArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            assertEquals(insertionSortArray[i], expectedArray[i]);
            System.out.println(insertionSortArray[i]);
        }
    }
}