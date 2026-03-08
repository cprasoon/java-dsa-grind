package org.demoapps.practice.pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternPrinterTest {

    PatternPrinter printer;

    @BeforeEach
    void setUp() {
        printer = new PatternPrinter();
    }

    @Test
    void printPatternAllStar() {
        printer.printPatternAllStar(5);
    }

    @Test
    void printPatternIncreasing() {
        printer.printPatternIncreasing(5);
    }

    @Test
    void printPatternDecreasing() {
        printer.printPatternDecreasing(5);
    }

    @Test
    void printPatternIncreasingNDecreasing() {
        printer.printPatternIncreasingAndDecreasing(5);
    }
}