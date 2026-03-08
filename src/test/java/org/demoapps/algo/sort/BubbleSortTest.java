package org.demoapps.algo.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class BubbleSortTest {

    @ParameterizedTest
    @MethodSource("intArrayArgs")
    void sort(int[] toSortArray) {
        int[] copy = Arrays.copyOf(toSortArray, toSortArray.length);
        Arrays.sort(copy);
        BubbleSort.sort(toSortArray);
        Assertions.assertArrayEquals(copy, toSortArray);
    }

    public static Stream<Arguments> intArrayArgs() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5,6,7,8,9}),
                Arguments.of(new int[]{9,8,7,6,5,4,3,2,1}),
                Arguments.of(new int[]{1,1,1,1,1,1,1,1}),
                Arguments.of(new int[]{}),
                Arguments.of(new int[]{98,87,76,65,54,43,32,21,10,1,2,3,4,5,6}));
    }
}