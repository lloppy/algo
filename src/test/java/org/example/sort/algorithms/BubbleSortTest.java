package org.example.sort.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    public static int[] array = new int[]{3, 1, 2, 5, 4,};

    @Test
    public void test() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] bubbleSortArray = bubbleSort.sort(array);
        int[] expectedArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            assertEquals(bubbleSortArray[i], expectedArray[i]);
            System.out.println(bubbleSortArray[i]);
        }
    }

}