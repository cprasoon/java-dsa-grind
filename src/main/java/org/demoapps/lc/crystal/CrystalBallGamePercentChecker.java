package org.demoapps.lc.crystal;

import org.apache.commons.lang3.time.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrystalBallGamePercentChecker implements CrystalBallGameCheck {
    Stats stats = new Stats();
    StopWatch stopWatch = new StopWatch();
    Logger logger = LoggerFactory.getLogger(CrystalBallGamePercentChecker.class);

    public int findFloor(boolean[] floorPlan) {
        int floor = 0;
        int firstCrystalBreakLevel = 0;
        int inc = 0;
        if (null != floorPlan && floorPlan.length > 0) {
            inc = floorPlan.length / 10;
            stopWatch.start();
            for (int i = 0; i <= floorPlan.length; i = i + inc) {
                stats.incrementFloorJumpCounter();
                firstCrystalBreakLevel = i > 0 ? i - 1 : 0;
                if (floorPlan[firstCrystalBreakLevel]) {
                    firstCrystalBreakLevel = i;
                    break;
                }
            }
            for (int j = firstCrystalBreakLevel - inc; j <= firstCrystalBreakLevel; j++) {
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
