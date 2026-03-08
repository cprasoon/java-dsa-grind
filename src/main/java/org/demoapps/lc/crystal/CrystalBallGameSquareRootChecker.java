package org.demoapps.lc.crystal;

import org.apache.commons.lang3.time.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrystalBallGameSquareRootChecker implements CrystalBallGameCheck {

    Stats stats = new Stats();
    StopWatch stopWatch = new StopWatch();
    Logger logger = LoggerFactory.getLogger(CrystalBallGameSquareRootChecker.class);

    public int findFloor(boolean[] floorPlan) {
        int floor = 0;
        int firstCrystalBreakLevel = 0;
        int inc = 0;
        if (null != floorPlan && floorPlan.length > 0) {
            inc = (int) Math.sqrt(floorPlan.length);
            stopWatch.start();
            for (int i = inc; i <= floorPlan.length; i = i + inc) {
                stats.incrementFloorJumpCounter();
                firstCrystalBreakLevel = i==floorPlan.length?floorPlan.length-1:i;

                if (floorPlan[firstCrystalBreakLevel]) {
                    break;
                }
            }

            int start=firstCrystalBreakLevel-inc >0 ? firstCrystalBreakLevel-inc : 0;

            for (int j = start; j <= firstCrystalBreakLevel; j++) {
                stats.incrementLinearComparison();
                if (floorPlan[j]) {
                    floor = j;
                    break;
                }
            }
            stopWatch.stop();
            logger.info(String.format("size:%d Increments of %d, runtime:%d, Comparison:%s", floorPlan.length, inc, stopWatch.getTime(), stats.logSummary()));
        }
        return floor;
    }
}