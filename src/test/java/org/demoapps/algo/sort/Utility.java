package org.demoapps.algo.sort;

import java.util.Random;

public class Utility {
    public static int[] randomIntArray(int size, int min, int max) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(max - min) + min;
        }
        return arr;
    }
}
