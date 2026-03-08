package org.demoapps.lc.coincombo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CoinComboSolutionTest {

    CoinComboSolution ccs;

    @BeforeEach
    void setUp() {
        ccs = new CoinComboSolution();
    }

    @Test
    void coinSolution() {
        int res = ccs.coinSolution(new int[]{1,2}, 3);
        Assertions.assertEquals(2, res);
    }

    @Test
    void coinSolutionTwo() {
        int res = ccs.coinSolution(new int[]{1,2,3}, 4);
        Assertions.assertEquals(4, res);
    }
}