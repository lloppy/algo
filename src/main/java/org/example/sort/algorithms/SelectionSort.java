package org.example.sort.algorithms;


import org.example.sort.Sort;

/*
    Сортировка выбором
    сложность - O(n^2)
    всегда всего операций - (n^2) / 2
    неустойчивая
*/
public class SelectionSort {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minElementIndex];
            array[minElementIndex] = temp;
        }
        return array;
    }
}
