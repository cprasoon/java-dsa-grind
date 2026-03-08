package org.demoapps.lc.leapclimb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeapClimbSolution {

    Logger logger = LoggerFactory.getLogger(LeapClimbSolution.class);

    public int leapClimb(int targetStep) {
        int result =  steps(targetStep);
        logger.info("Leap Climb Steps:{} result: {}",targetStep, result);
        return result;
    }

    public int steps(int targetStep) {
        if(targetStep == 0 || targetStep == 1) {
            return 1;
        }

        return steps(targetStep - 1) + steps(targetStep - 2);
    }
}
