package org.example.sort.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortingByCountingTest {

    public static int[] array = new int[]{3, 4, 2, 1, 5};

    @Test
    public void sort() {
        SortingByCounting sortingByCounting = new SortingByCounting();

        int[] sortingByCountingArray = sortingByCounting.sort(array);
        int[] expectedArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            assertEquals(sortingByCountingArray[i], expectedArray[i]);
            System.out.println(sortingByCountingArray[i]);
        }
    }
}