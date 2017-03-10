package by.bogdan.leetcode;

//import java.util.Arrays;

import java.util.Arrays;

/**
 * Solution for https://leetcode.com/problems/coin-change/
 */
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }
        int[] dp = new int[amount + 1];
        for (int a = 1; a <= amount; a++) {
            int minCount = Integer.MAX_VALUE;
            for (int i = 0; i < coins.length; i++) {
                int coin = coins[i];
                int rest = a % coin;
                int count = 0;
                if (rest == 0) {
                    count = a / coin;
                } else {
                    if (a - coin > 0 && dp[a - coin] > 0) {
                        count = dp[a - coin] + 1;
                    }
                }
                if (0 < count && count < minCount) {
                    minCount = count;
                }
            }
            dp[a] = minCount == Integer.MAX_VALUE ? 0 : minCount;
        }
        return (amount > 0 && dp[amount] == 0) ? -1 : dp[amount];
    }

    public int coinChange2(int[] coins, int amount) {
        int[] counts = new int[amount + 1];
        Arrays.fill(counts, Integer.MAX_VALUE);
        return coinChangeRecursive(coins, amount, counts);
    }

    private int coinChangeRecursive(int[] coins, int amount, int[] counts) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        if (counts[amount] < Integer.MAX_VALUE) {
            return counts[amount];
        }
        int minValue = Integer.MAX_VALUE;
        for (int coin : coins) {
            int value = coinChangeRecursive(coins, amount - coin, counts);
            if (value >= 0 && value < minValue) {
                minValue = value + 1;
            }
        }
        if (minValue == Integer.MAX_VALUE) {
            minValue = -1;
        }
        counts[amount] = minValue;
        return minValue;
    }
}
