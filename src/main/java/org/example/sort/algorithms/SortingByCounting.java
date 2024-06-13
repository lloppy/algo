package org.example.sort.algorithms;

import org.example.sort.Sort;

/*
    Сортировка чисел подсчётом
    O(n) + O(1000)
*/
public class SortingByCounting {

    public static int[] sort(int[] array) {
        int[] countArray = new int[5000];
        for (int i : array) {
            countArray[i] += 1;
        }

        int currentIndex = 0;
        for (int i = 0; i < countArray.length; ++i) {
            for (int j = 0; j < countArray[i]; ++j) {
                array[currentIndex] = i;
                currentIndex += 1; // [3, 3, 1, 6, 1, 4, 3]
                                   // 0, 2, 0, 3, 1, 0, 1
            }
        }
        return array;
    }
}
