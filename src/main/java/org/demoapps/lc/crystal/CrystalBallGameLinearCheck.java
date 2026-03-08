package org.demoapps.lc.crystal;

import org.apache.commons.lang3.time.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CrystalBallGameLinearCheck implements CrystalBallGameCheck {

    Stats stats = new Stats();
    StopWatch stopWatch = new StopWatch();
    Logger logger = LoggerFactory.getLogger(CrystalBallGameLinearCheck.class);

    public int findFloor(boolean[] floorPlan) {
        int floor = 0;
        if (null != floorPlan && floorPlan.length > 0) {
            stopWatch.start();
            for (int i = 0; i < floorPlan.length; i++) {
                stats.incrementLinearComparison();
                if (floorPlan[i]) {
                    floor = i;
                    break;
                }
            }
            stopWatch.stop();
            logger.info(String.format("size:%d Increments of %d, runtime:%d, Comparison:%s", floorPlan.length, 1, stopWatch.getTime(), stats.logSummary()));

        }
        return floor;
    }
}
