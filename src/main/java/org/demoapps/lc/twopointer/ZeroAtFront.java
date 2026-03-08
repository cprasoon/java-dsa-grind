package org.demoapps.lc.twopointer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ZeroAtFront {

    private static final Logger logger = LoggerFactory.getLogger(ZeroAtFront.class);

    public void moveZeroes(int[] nums) {

        if (nums == null || nums.length == 0 || nums.length == 1)
            return;

        int i = nums.length - 1;
        for (int j = nums.length - 1; j > 0; j--) {
            if (nums[j] != 0) {
                logger.info("j:{}, i:{}", j, i);
                if (i != j) {
                    int temp = nums[j];
                    nums[j] = 0;
                    nums[i] = temp;
                }
                i--;
            }
            logger.info("Array state:{}", Arrays.toString(nums));
        }
    }

}
