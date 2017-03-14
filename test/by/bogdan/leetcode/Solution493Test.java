package by.bogdan.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class Solution493Test {
    private static final String DATA_FILE = "Data493.csv";
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream(DATA_FILE)))) {
            String line = reader.readLine();
            String[] snums = line.split(",");
            nums = new int[snums.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.valueOf(snums[i]);
            }
        }
    }

    @Test
    public void reversePairs() throws Exception {
        assertEquals(625284395, new Solution493().reversePairs(nums));
        assertEquals(2, new Solution493().reversePairs(new int[]{1, 3, 2, 3, 1}));
        assertEquals(3, new Solution493().reversePairs(new int[]{2, 4, 3, 5, 1}));
    }
}