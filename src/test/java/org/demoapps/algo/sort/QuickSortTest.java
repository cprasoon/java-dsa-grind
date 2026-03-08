package org.demoapps.algo.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    QuickSort quickSort;

    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    void sortNullCheck() {
        quickSort.sort(null);
        quickSort.sort(new int[0]);
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {5};
        quickSort.sort(arr);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    void sortBasicWorstCaseCheck() {
        int[] arr = new int[]{3, 2, 1, 0};
        quickSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3}, arr);
    }

    @Test
    void sortBasicBestAvgCheck() {
        int[] arr = new int[]{0, 3, 2, 1};
        quickSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3}, arr);
    }

    @Test
    void sortBasicBestCaseCheck() {
        int[] arr = new int[]{0, 1, 2, 3};
        quickSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3}, arr);
    }

    @Test
    void sortBasicCheck2() {
        int[] arr = new int[]{32, 80, 7, 84, 44, 87, 70, 34, 14, 97};
        quickSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{7, 14, 32, 34, 44, 70, 80, 84, 87, 97}, arr);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {5, 2, 8, 1, 9, 2, 5};
        quickSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 5, 5, 8, 9}, arr);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 100, 1000, 10000})
    void sortBig10Check(int size) {
        int[] arr = Utility.randomIntArray(size, -10000, 10000);
        int[] copy = Arrays.copyOf(arr, arr.length);

        System.out.println("Pre sort ORG:" + Arrays.toString(arr));
        System.out.println("Pre sort CPY:" + Arrays.toString(copy));
        quickSort.sort(arr);
        Arrays.sort(copy);
        System.out.println("Post sort ORG:" + Arrays.toString(arr));
        System.out.println("Post sort CPY:" + Arrays.toString(copy));
        Assertions.assertArrayEquals(copy, arr);
    }

}