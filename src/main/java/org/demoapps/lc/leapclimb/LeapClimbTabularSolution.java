package org.demoapps.lc.leapclimb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class LeapClimbTabularSolution {

    HashMap<Integer, Integer> results = new HashMap<>();

    Logger logger = LoggerFactory.getLogger(LeapClimbTabularSolution.class);

    public int leapClimb(int targetStep) {
        int result = steps(targetStep);
        logger.info("Leap Climb Steps:{} result: {}", targetStep, result);
        return result;
    }

    public int steps(int targetStep) {
        results.put(0, 1);
        results.put(1, 1);
        for (int i = 2; i <= targetStep; i++) {
            results.put(i, results.get(i - 1) + results.get(i - 2));
        }
        int result = results.get(targetStep);
        logger.info("Map state: {}", results);
        return result;
    }
}
