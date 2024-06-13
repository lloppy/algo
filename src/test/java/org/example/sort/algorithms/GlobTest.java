package org.example.sort.algorithms;

import org.example.sort.Sort;
import org.example.sort.algorithms.red_black.RedBlackTreeSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class GlobTest {
    public static int[] array = new int[]{5, 1, 2, 4, 3,};

    @Test
    public void globalTest() {
        List<Sort> algorithms = new ArrayList<>();
        algorithms.add(new BubbleSort());
//        algorithms.add(new InsertionSort());
//        algorithms.add(new RadixSort());
//        algorithms.add(new QuickSort());
//        algorithms.add(new SelectionSort());
//        algorithms.add(new SortingByCounting());
     //   algorithms.add(new RedBlackTreeSort());

        int[] expectedArray = new int[]{1, 2, 3, 4, 5};

        for (Sort algorithm : algorithms) {
            shuffle(array);

            int[] sortedArray = algorithm.sort(array);
            for (int i = 0; i < array.length; i++) {
                assertEquals(sortedArray[i], expectedArray[i]);
                System.out.println(sortedArray[i]);
            }
            System.out.println(algorithm.getClass().getSimpleName());
        }
    }

    public static void shuffle(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}


