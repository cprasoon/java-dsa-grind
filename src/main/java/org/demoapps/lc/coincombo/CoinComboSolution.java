package org.demoapps.lc.coincombo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class CoinComboSolution {

    Logger logger = LoggerFactory.getLogger(CoinComboSolution.class);

    public int coinSolution(int[] coins, int amount) {
        int ways = findPaths(coins, coins.length, amount);
        return ways;
    }

    int findPaths(int[] coins, int n, int amount) {
        logger.debug("findPaths: {}, visibility:{}, amount: {}", Arrays.toString(coins), n, amount);
        if (amount == 0) {
            logger.debug("RESS findPaths: {}, visibility:{}, amount: {}, result:{}", Arrays.toString(coins), n, amount,1);
            return 1;
        }
        if (amount < 0 || n == 0) {
            logger.debug("RESS findPaths: {}, visibility:{}, amount: {}, result:{}", Arrays.toString(coins), n, amount,0);
            return 0;
        }
        int newTargetAmount = amount - coins[n - 1];

        int paths = findPaths(coins, n, newTargetAmount)
                    + findPaths(coins, n-1, amount);
        return paths;
    }

}
