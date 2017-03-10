package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Solution486Test {
    @Test
    public void testPredictTheWinner() {
        int[] nums = {1, 1, 5, 1};
        assertTrue(new Solution486().predictTheWinner(nums));

        nums = new int[]{1, 3, 1};
        assertFalse(new Solution486().predictTheWinner(nums));
    }

    @Test
    public void testPredictTheWinnerDP() {
        int[] nums = {1, 1, 5, 1};
        assertTrue(new Solution486().predictTheWinnerDP(nums));

        nums = new int[]{1, 3, 1};
        assertFalse(new Solution486().predictTheWinnerDP(nums));
    }
}
