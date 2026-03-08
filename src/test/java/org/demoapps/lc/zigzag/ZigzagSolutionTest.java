package org.demoapps.lc.zigzag;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZigzagSolutionTest {

    ZigzagSolution zigzagSolution;

    @BeforeEach
    void setUp() {
        zigzagSolution = new ZigzagSolution();
    }

    @Test
    void convertFour() {
        String result = zigzagSolution.convert("PAYPALISHIRING", 4);
        Assertions.assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    void converThree() {
        String result = zigzagSolution.convert("PAYPALISHIRING", 3);
        Assertions.assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void convertAOne() {
        String result = zigzagSolution.convert("A", 1);
        Assertions.assertEquals("A", result);
    }

    @Test
    void convertAbOne() {
        String result = zigzagSolution.convert("AB", 1);
        Assertions.assertEquals("AB", result);
    }
}