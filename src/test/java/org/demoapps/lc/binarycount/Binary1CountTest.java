package org.demoapps.lc.binarycount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Binary1CountTest {

    Binary1Count bc;

    @BeforeEach
    void setUp() {
        bc = new Binary1Count();
    }

    @Test
    void countBitsZero() {
        int[] result = bc.countBits(0);
        Assertions.assertArrayEquals(new int[]{0}, result);
    }

    @Test
    void countBitsThree() {
        int[] result = bc.countBits(3);
        Assertions.assertArrayEquals(new int[]{0,1,1,2}, result);
    }

    @Test
    void countBits() {
        int[] result = bc.countBits(5);
        Assertions.assertArrayEquals(new int[]{0,1,1,2,1,2}, result);
    }
}