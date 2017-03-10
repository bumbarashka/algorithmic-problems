package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/predict-the-winner/
 */
public class Solution486 {
    public boolean predictTheWinner(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            totalSum += nums[i];
        }

        long sumToWin = Math.round(totalSum / 2.0);

        return player1Step(nums, sumToWin, 0, nums.length - 1);
    }

    private boolean player1Step(int[] nums, long restSum, int l, int r) {
        if (r > l) {
            if (restSum - nums[l] <= 0 || restSum - nums[r] <= 0) {
                return true;
            } else {
                return !player2Step(nums, restSum - nums[l], l + 1, r) || !player2Step(nums, restSum - nums[r], l, r - 1);
            }
        } else {
            restSum -= nums[l];
            return restSum <= 0;
        }

    }

    private boolean player2Step(int[] nums, long restSum, int l, int r) {
        if (r > l) {
            return !player1Step(nums, restSum, l + 1, r) || !player1Step(nums, restSum, l, r - 1);
        } else {
            return restSum > 0;
        }
    }


    public boolean predictTheWinnerDP(int[] nums) {
        int length = nums.length;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; ++i) {
            dp[i][i] = nums[i];
        }
        for (int shift = 1; shift < length; ++shift) {
            for (int i = 0; i < length - shift; ++i) {
                dp[i][i + shift] = Math.max(nums[i] - dp[i + 1][i + shift], nums[i + shift] - dp[i][i + shift - 1]);
            }
        }
        return dp[0][length - 1] >= 0;
    }
}
