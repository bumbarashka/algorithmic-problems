package by.bogdan.leetcode;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class Solution493Test {
    @Test
    public void reversePairs() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("Data493.csv")));
        String line = reader.readLine();
        String[] snums = line.split(",");
        int[] nums = new int[snums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(snums[i]);
        }
        assertEquals(625284395, new Solution493().reversePairs(nums));
        assertEquals(2, new Solution493().reversePairs(new int[]{1, 3, 2, 3, 1}));
        assertEquals(3, new Solution493().reversePairs(new int[]{2, 4, 3, 5, 1}));
    }
}