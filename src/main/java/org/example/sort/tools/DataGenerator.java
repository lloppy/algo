package org.example.sort.tools;

import org.example.sort.data.Experiment;

import java.util.Random;

public class DataGenerator {

    public static int[] generateRandomArray(Experiment experiment) {
        int[] array = new int[experiment.length];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt());
        }
        return array;
    }

    public static int[] generateArray(Experiment experiment) {
        int[] array = new int[experiment.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return shuffle(array);
    }

    private static int[] shuffle(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }
}

