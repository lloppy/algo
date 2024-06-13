package org.example.sort.algorithms;

import org.example.sort.Sort;
import org.example.sort.algorithms.red_black.RedBlackTreeSort;
import org.example.sort.data.Experiment;
import org.example.sort.tools.DataGenerator;
import org.example.sort.tools.Reader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class GlobTestWithGeneratedArray {
    ArrayList<Experiment> experiments = Reader.readJsonFile();

    @Test
    public void globalTest() {
        List<Sort> algorithms = new ArrayList<>();
        algorithms.add(new BubbleSort());
//        algorithms.add(new InsertionSort());
//        algorithms.add(new QuickSort());
//        algorithms.add(new RadixSort());
//        algorithms.add(new SelectionSort());
//        algorithms.add(new SortingByCounting());
   //     algorithms.add(new RedBlackTreeSort());

        for (int e = 0; e < experiments.size(); e++) {
            int[] array = DataGenerator.generateArray(experiments.get(e));

            for (Sort algorithm : algorithms) {
                shuffle(array);
                System.out.println(Arrays.toString(array));
                int[] sortedArray = algorithm.sort(array);
                System.out.println(Arrays.toString(sortedArray));

                for (int i = 0; i < array.length - 1; i++) {
                    assertTrue(sortedArray[i] <= sortedArray[i + 1]);
                    System.out.println(sortedArray[i]);
                }
                System.out.println(algorithm.getClass().getSimpleName());
            }
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


