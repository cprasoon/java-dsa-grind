package org.demoapps.algo.search;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class BinarySearchTest {

    int[] searchArray;
    @BeforeEach
    void setUp() {
        searchArray = new int[]{12, 9, 56, 88, 45, 444, 67, 98, 454};
        Arrays.sort(searchArray);
    }

    @AfterEach
    void tearDown() {
        searchArray = null;
    }

    @ParameterizedTest
    @CsvSource({
            "-1,-100",
            "-1,1000",
            "0,9",
            "8,454",
            "5,88",
            "6,98",
            "2,45"})
    void binarySearchPram(int expectedResult, int valToSearch) {
        int result = BinarySearch.search(searchArray, valToSearch);
        Assertions.assertEquals(expectedResult, result);
    }

}