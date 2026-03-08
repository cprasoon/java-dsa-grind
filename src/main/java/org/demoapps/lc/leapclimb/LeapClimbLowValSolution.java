package org.demoapps.lc.leapclimb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeapClimbLowValSolution {

    Logger logger = LoggerFactory.getLogger(LeapClimbLowValSolution.class);

    public int leapClimb(int targetStep) {
        int result = steps(targetStep);
        logger.info("Leap Climb Steps:{} result: {}", targetStep, result);
        return result;
    }

    public int steps(int targetStep) {
        int prev1 = 1;
        int prev2 = 1;

        for (int i = 2; i <= targetStep; i++) {
            int temp = prev1 + prev2;
            prev1 = prev2;
            prev2 = temp;
        }

        logger.info("Result: {}", prev2);
        return prev2;
    }
}
