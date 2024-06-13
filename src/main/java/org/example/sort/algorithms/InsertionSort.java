package org.example.sort.algorithms;

import org.example.sort.Sort;

/*
    Сортировка вставками
    устойчивая
    О(n^2) - в худшем, О(n) - в лучшем
*/
public class InsertionSort {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int temp = array[i];
            int insertIndex = i;
            while (insertIndex > 0 && array[insertIndex - 1] > temp) {
                array[insertIndex] = array[insertIndex - 1];
                insertIndex--;
            }
            array[insertIndex] = temp;
        }
        return array;
    }
}
