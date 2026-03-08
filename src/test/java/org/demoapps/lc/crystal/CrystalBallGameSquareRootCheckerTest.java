package org.demoapps.lc.crystal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.demoapps.lc.crystal.BooleanArrayGenerator.generate;

class CrystalBallGameSquareRootCheckerTest {

    CrystalBallGameSquareRootChecker check;

    @BeforeEach
    void setUp() {
        check = new CrystalBallGameSquareRootChecker();
    }

    @Test
    void testWhenEmpty() {
        check.findFloor(null);
    }

    @Test
    void testTen() {
        boolean[] floorPlan = generate(10, 7);
        Assertions.assertEquals(7, check.findFloor(floorPlan));
    }

    @Test
    void testTenEnd() {
        boolean[] floorPlan = generate(10, 9);
        Assertions.assertEquals(9, check.findFloor(floorPlan));
    }

    @ParameterizedTest
    @CsvSource({"10,0",
            "10,1",
            "10,2",
            "10,3",
            "10,4",
            "10,5",
            "10,6",
            "10,7",
            "10,8",
            "10,9",
    })
    void testTenGeneric(int size, int start) {
        boolean[] floorPlan = generate(size, start);
        Assertions.assertEquals(start, check.findFloor(floorPlan));
    }

    @Test
    void testHundredSecondLastSegment() {
        boolean[] floorPlan = generate(100, 87);
        Assertions.assertEquals(87, check.findFloor(floorPlan));
    }

    @Test
    void testHundredLastSegment() {
        boolean[] floorPlan = generate(100, 95);
        Assertions.assertEquals(95, check.findFloor(floorPlan));
    }

    @ParameterizedTest
    @CsvSource({"100,0",
            "100,1",
            "100,11",
            "100,19",
            "100,20",
            "100,24",
            "100,30",
            "100,35",
            "100,40",
            "100,48",
            "100,50",
            "100,54",
            "100,60",
            "100,69",
            "100,70",
            "100,72",
            "100,80",
            "100,87",
            "100,90",
            "100,99",
    })
    void testHundredGeneric(int size, int start) {
        boolean[] floorPlan = generate(size, start);
        Assertions.assertEquals(start, check.findFloor(floorPlan));
    }

    @Test
    void testThousandLastSegment() {
        boolean[] floorPlan = generate(1000, 950);
        Assertions.assertEquals(950, check.findFloor(floorPlan));
    }

    @Test
    void testTenThousandLastSegment() {
        boolean[] floorPlan = generate(10000, 9980);
        Assertions.assertEquals(9980, check.findFloor(floorPlan));
    }

    @Test
    void testHunderedThousandLastSegment() {
        boolean[] floorPlan = generate(1_000_000, 999998);
        Assertions.assertEquals(999998, check.findFloor(floorPlan));
    }
}