package org.example.sort.algorithms;

import org.example.sort.Sort;
import org.example.sort.algorithms.red_black.RedBlackTreeSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class RedBlackTreeSortTest {
    public static int[] array = new int[]{5, 1, 2, 4, 3};

    @Test
    public void test() {
        RedBlackTreeSort redBlackTreeSort = new RedBlackTreeSort();

        int[] redBlackTreeSortArray = redBlackTreeSort.sort(array);
        int[] expectedArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            assertEquals(redBlackTreeSortArray[i], expectedArray[i]);
            System.out.println(redBlackTreeSortArray[i]);
        }
    }
}