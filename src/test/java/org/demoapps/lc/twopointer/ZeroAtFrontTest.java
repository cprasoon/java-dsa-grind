package org.demoapps.lc.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroAtFrontTest {

    ZeroAtFront zaf;

    @BeforeEach
    void setUp() {
        zaf = new ZeroAtFront();
    }

    @Test
    void moveZeroes() {
        int[] array = new int[]{0, 4, 0, 2, 3};
        zaf.moveZeroes(array);
        assertArrayEquals(new int[]{0, 0, 4, 2, 3}, array);
    }
}