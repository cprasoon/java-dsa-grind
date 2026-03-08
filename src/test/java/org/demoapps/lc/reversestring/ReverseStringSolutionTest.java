package org.demoapps.lc.reversestring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringSolutionTest {

    ReverseStringSolution solution;
    @BeforeEach
    void setUp() {
        solution = new ReverseStringSolution();
    }

    @Test
    void reverseWords() {
        String result = solution.reverseWords("");
        assertEquals("", result);

        result = solution.reverseWords(null);
        assertEquals(null, result);
    }

    @ParameterizedTest
    @CsvSource({
            "the sky is blue,blue is sky the",
            "  hello world  , world hello",
            "a good   example,example good a"
    })
    void reverseWordsGeneric(String input, String expected) {
        String result = solution.reverseWords(input);
        assertEquals(expected, result);
    }
}