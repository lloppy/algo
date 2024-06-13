package org.example.sort.algorithms;

import org.example.sort.Sort;

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        for (int j = 0; j < array.length - 1; ++j) {
            boolean flag = false;

            for (int i = 0; i < array.length - 1 - j; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    flag = true;
                }
            }
            if (!flag) break;
        }
        return array;
    }
}