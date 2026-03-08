package org.demoapps.lc.mergeSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringAlternativelySolutionTest {

    MergeStringAlternativelySolution solution;

    @BeforeEach
    void setUp() {
        solution = new MergeStringAlternativelySolution();
    }

    @ParameterizedTest
    @CsvSource({
            "abc,pqr,apbqcr",
            "ab,pqrs,apbqrs",
            "abcd,pq,apbqcd",
    })
    void mergeAlternately(String a, String b, String expected) {
        String result = solution.mergeAlternately(a, b);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void nullTest() {
        String result = solution.mergeAlternately(null, "abc");
        Assertions.assertEquals("abc", result);

        result = solution.mergeAlternately("pqr", "");
        Assertions.assertEquals("pqr", result);

        result = solution.mergeAlternately(null, null);
        Assertions.assertEquals(null, result);

        result = solution.mergeAlternately("", "");
        Assertions.assertEquals("", result);
    }
}