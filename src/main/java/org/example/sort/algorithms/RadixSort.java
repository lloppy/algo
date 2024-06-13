package org.example.sort.algorithms;


import org.example.sort.Sort;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    public static int[] sort(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max)
                max = num;
        }

        int exp = 1;
        while (max / exp > 0) {
            array = placeSort(array, exp);
            exp *= 10;
        }
        return array;
    }

    private static int[] placeSort(int[] array, int exp) {
        List<List<Integer>> position = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            position.add(new ArrayList<>());
        }

        for (int value : array) {
            int index = (value / exp) % 10;
            position.get(index).add(value);
        }

        int index = 0;
        for (List<Integer> values : position) {
            for (int value : values) {
                array[index++] = value;
            }
        }
        return array;
    }
}
