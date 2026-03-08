package org.demoapps.lc.leapclimb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeapClimbMemoSolution {

    int[] results;

    Logger logger = LoggerFactory.getLogger(LeapClimbMemoSolution.class);

    public int leapClimb(int targetStep) {
        results = new int[targetStep+1];

        int result =  steps(targetStep);
        logger.info("Leap Climb Steps:{} result: {}",targetStep, result);
        return result;
    }

    public int steps(int targetStep) {
        if(targetStep == 0 || targetStep == 1) {
            return 1;
        }

        int result = 0;

        if(results[targetStep] != 0) {
            return results[targetStep];
        } else {
            result = steps(targetStep - 1) + steps(targetStep - 2);
            results[targetStep] = result;
        }
        logger.info("Map state: {}", results);
        return result;
    }
}
