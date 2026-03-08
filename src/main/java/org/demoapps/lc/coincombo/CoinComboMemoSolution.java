package org.demoapps.lc.coincombo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;

public class CoinComboMemoSolution {

    Logger logger = LoggerFactory.getLogger(CoinComboMemoSolution.class);

    HashMap<String, Integer> memo = new HashMap<>();

    public int coinSolution(int[] coins, int amount) {
        int ways = findPaths(coins, coins.length, amount);
        return ways;
    }

    int findPaths(int[] coins, int n, int amount) {
        logger.debug("findPaths: {}, visibility:{}, amount: {}", Arrays.copyOf(coins, n), n, amount);
        if (amount == 0) {
            logger.debug("RESS findPaths: {}, visibility:{}, amount: {}, result:{}", Arrays.copyOf(coins, n), n, amount, 1);
            return 1;
        }
        if (amount < 0 || n == 0) {
            logger.debug("RESS findPaths: {}, visibility:{}, amount: {}, result:{}", Arrays.copyOf(coins, n), n, amount, 0);
            return 0;
        }
        int newTargetAmount = amount - coins[n - 1];


        int path1Result = -1;
        int path2Result = -1;

        if (memo.containsKey(n + "," + newTargetAmount)) {
            path1Result = memo.get(n + "," + newTargetAmount);
            logger.debug("Returning from memo:{} result:{}", n + "," + newTargetAmount, path1Result);
        }

        if (memo.containsKey((n - 1) + "," + amount)) {
            path2Result = memo.get((n - 1) + "," + amount);
            logger.debug("Returning from memo:{} result:{}", (n - 1) + "," + amount, path2Result);
        }

        path1Result = (path1Result == -1) ? findPaths(coins, n, newTargetAmount) : path1Result;
        memo.put(n + "," + newTargetAmount, path1Result);

        path2Result = (path2Result == -1) ? findPaths(coins, n - 1, amount) : path2Result;
        memo.put(n - 1 + "," + amount, path2Result);

        int result = path1Result + path2Result;
        memo.put(n + "," + amount, result);

        return result;
    }

}
