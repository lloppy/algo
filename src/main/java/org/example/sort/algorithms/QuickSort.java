package org.example.sort.algorithms;

import org.example.sort.Sort;

public class QuickSort {

    public static int[] sort(int[] array){
        sort(array, 0, array.length - 1);
        return array;
    }

    public static void sort(int[] array, int left, int right) {
        if (left < right) {
            int mainElement = partition(array, left, right);

            sort(array, left, mainElement - 1);
            sort(array, mainElement + 1, right);
        }
    }

    static int partition(int[] array, int left, int right) {
        int mainElement = array[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (array[j] < mainElement) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
