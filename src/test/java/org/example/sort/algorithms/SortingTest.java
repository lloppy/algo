package org.example.sort.algorithms;

import org.example.sort.algorithms.red_black.RedBlackTreeSort;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class SortingTest {

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 5000, 10000, 50000};
        StringBuilder results = new StringBuilder();

        for (int size : sizes) {
            int[] array = generateRandomArray(size);

            results.append("Размер массива: ").append(size).append("\n");

            // Insertion Sort
            int[] insertionSortArray = Arrays.copyOf(array, array.length);
            long insertionSortTime = measureTime(() -> InsertionSort.sort(insertionSortArray));
            results.append("Insertion Sort: ").append(insertionSortTime).append("ns").append("\n");

            // Quick Sort
            int[] quickSortArray = Arrays.copyOf(array, array.length);
            long quickSortTime = measureTime(() -> QuickSort.sort(quickSortArray));
            results.append("Quick Sort: ").append(quickSortTime).append("ns").append("\n");

            // Radix Sort
            int[] radixSortArray = Arrays.copyOf(array, array.length);
            long radixSortTime = measureTime(() -> RadixSort.sort(radixSortArray));
            results.append("Radix Sort: ").append(radixSortTime).append("ns").append("\n");

            // Selection Sort
            int[] selectionSortArray = Arrays.copyOf(array, array.length);
            long selectionSortTime = measureTime(() -> SelectionSort.sort(selectionSortArray));
            results.append("Selection Sort: ").append(selectionSortTime).append("ns").append("\n");

            // Sorting By Counting
            int[] redBlack = Arrays.copyOf(array, array.length);
            RedBlackTreeSort redBlackTreeSort = new RedBlackTreeSort();
            long redBlackTime = measureTime(() -> redBlackTreeSort.sort(redBlack));
            results.append("Red Black tree Sort: ").append(redBlackTime).append("ns").append("\n");

            results.append("\n");
        }

        writeResultsToFile("sort_report.txt", results.toString());
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    @FunctionalInterface
    interface SortAlgorithm {
        void sort();
    }

    private static long measureTime(SortAlgorithm algorithm) {
        long startTime = System.nanoTime();
        algorithm.sort();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static void writeResultsToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}