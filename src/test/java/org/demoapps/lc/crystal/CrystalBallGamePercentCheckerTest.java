package org.demoapps.lc.crystal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.demoapps.lc.crystal.BooleanArrayGenerator.generate;

class CrystalBallGamePercentCheckerTest {

    CrystalBallGamePercentChecker check;

    @BeforeEach
    void setUp() {
        check = new CrystalBallGamePercentChecker();
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
    void testHundredSecondLastSegment() {
        boolean[] floorPlan = generate(100, 87);
        Assertions.assertEquals(87, check.findFloor(floorPlan));
    }

    @Test
    void testHundredLastSegment() {
        boolean[] floorPlan = generate(100, 95);
        Assertions.assertEquals(95, check.findFloor(floorPlan));
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