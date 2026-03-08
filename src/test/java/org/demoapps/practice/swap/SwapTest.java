package org.demoapps.practice.swap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapTest {

    Swap swap;

    @BeforeEach
    void setUp() {
        swap = new Swap();
    }

    @Test
    void doSwap() {
        Swap.MyInt a = new Swap.MyInt(10);
        Swap.MyInt b = new Swap.MyInt(90);

        swap.doSwap(a, b);
        Assertions.assertEquals(90, a.data);
        Assertions.assertEquals(10, b.data);
    }
}