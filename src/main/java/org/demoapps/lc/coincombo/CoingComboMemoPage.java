package org.demoapps.lc.coincombo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class CoingComboMemoPage {
    private static final Logger logger = LoggerFactory.getLogger(CoingComboMemoPage.class);

    static int countRecur(int[] coins, int n, int sum, int[][] dp) {

        for(int[] i: dp) {
            logger.info("DP State: {}", Arrays.toString(i));
        }

        // If sum is 0 then there is 1 solution
        if (sum == 0) return 1;

        if (sum < 0 || n == 0) return 0;

        // If the subproblem is previously calculated then
        // simply return the result
        if (dp[n - 1][sum] != -1) return dp[n - 1][sum];

        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return dp[n - 1][sum] =
                countRecur(coins, n, sum - coins[n - 1], dp) +
                        countRecur(coins, n - 1, sum, dp);
    }

    public static int count(int[] coins, int sum) {
        int[][] dp = new int[coins.length][sum + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return countRecur(coins, coins.length, sum, dp);
    }

}
