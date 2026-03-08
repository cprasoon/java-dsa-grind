package org.demoapps.lc.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroAtEndTest {

    ZeroAtEnd zae;

    @BeforeEach
    void setUp() {
        zae = new ZeroAtEnd();
    }

    @Test
    void moveZeroes() {
        int[] array = new int[]{0, 4, 0, 2, 3};
        zae.moveZeroes(array);
        assertArrayEquals(new int[]{4, 2, 3, 0, 0}, array);
    }
}