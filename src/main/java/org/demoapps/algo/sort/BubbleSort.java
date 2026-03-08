package org.demoapps.algo.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class BubbleSort {
    private static final Logger logger = LoggerFactory.getLogger(BubbleSort.class);

    public static void sort(int[] input) {
        logger.info("INIT: ",Arrays.toString(input));
        if (input != null && input.length > 0) {
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input.length - 1 - i; j++) {
                    if (input[j] > input[j + 1]) {
                        int temp = input[j + 1];
                        input[j + 1] = input[j];
                        input[j] = temp;
                    }
                }
                logger.info(String.format("After ITER:%2d %s", i + 1, Arrays.toString(input)));
            }
        }
        logger.info("FIN: ", Arrays.toString(input));
    }
}
