package org.example.sort.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    public static int[] array = new int[]{3, 4, 2, 1, 5};

    @Test
    public void sort() {
        SelectionSort selectionSort = new SelectionSort();

        int[] selectionSortArray = selectionSort.sort(array);
        int[] expectedArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            assertEquals(selectionSortArray[i], expectedArray[i]);
            System.out.println(selectionSortArray[i]);
        }
    }
}