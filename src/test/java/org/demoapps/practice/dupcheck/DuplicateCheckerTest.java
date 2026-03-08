package org.demoapps.practice.dupcheck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuplicateCheckerTest {

    DuplicateChecker duplicateChecker;

    @BeforeEach
    void setUp() {
        duplicateChecker = new DuplicateChecker();
    }

    @Test
    void checkDuplicates() {
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        int[] expected = {1, 2, 3};

        Assertions.assertArrayEquals(expected, duplicateChecker.checkDuplicates(sourceArray));
    }

    @Test
    void checkDuplicatesNoDups() {
        int[] sourceArray = {1, 2, 3, 4, 5, 6};
        int[] expected = {};

        Assertions.assertArrayEquals(expected, duplicateChecker.checkDuplicates(sourceArray));
    }

    @Test
    void checkDuplicatesNullInput() {
        int[] expected = {};

        Assertions.assertArrayEquals(expected, duplicateChecker.checkDuplicates(null));
    }

    @Test
    void checkDuplicatesSizeOne() {
        int[] sourceArray = {1};
        int[] expected = {};

        Assertions.assertArrayEquals(expected, duplicateChecker.checkDuplicates(sourceArray));
    }

    @Test
    void checkDuplicatesMultiOne() {
        int[] sourceArray = {1, 1, 1};
        int[] expected = {1};

        Assertions.assertArrayEquals(expected, duplicateChecker.checkDuplicates(sourceArray));
    }
}