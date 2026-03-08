package org.demoapps.lc.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IntegerReverseTest {

    IntegerReverse integerReverse;

    @BeforeEach
    void setUp() {
        integerReverse = new IntegerReverse();
    }

    @ParameterizedTest
    @CsvSource({
            "321,123",
            "-123,-321",
            "0,0",
            "987654321,123456789",
            "987654321,123456789",
    })
    void reverse(int expected, int val) {
        int result = integerReverse.reverse(val);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void reverseSimpleTestOverflow() {
        int result = integerReverse.reverse(1534236469);
        Assertions.assertEquals(0, result);
    }
}