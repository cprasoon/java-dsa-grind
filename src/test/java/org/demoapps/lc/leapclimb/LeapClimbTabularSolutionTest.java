package org.demoapps.lc.leapclimb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LeapClimbTabularSolutionTest {

    LeapClimbTabularSolution lcs;

    @BeforeEach
    void setUp() {
        lcs = new LeapClimbTabularSolution();
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "4,5",
            "5,8",
            "6,13",
            "7,21",
            "25,121393",
            "30,1346269",
            "35,14930352"
    })
    void leapClimb(int targetStep, int expectedResult) {
        int result = lcs.leapClimb(targetStep);
        Assertions.assertEquals(expectedResult, result);
    }
}