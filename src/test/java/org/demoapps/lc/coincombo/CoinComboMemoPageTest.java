package org.demoapps.lc.coincombo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoinComboMemoPageTest {

    @Test
    void coinSolution() {
        int res = CoingComboMemoPage.count(new int[]{1, 2}, 3);
        Assertions.assertEquals(2, res);
    }

    @Test
    void coinSolutionTwo() {
        int res = CoingComboMemoPage.count(new int[]{1, 2, 3}, 4);
        Assertions.assertEquals(4, res);
    }

    @Test
    void coinSolutionThree() {
        int res = CoingComboMemoPage.count(new int[]{1, 2, 3}, 6);
        Assertions.assertEquals(7, res);
    }
}