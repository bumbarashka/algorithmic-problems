package by.bogdan.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution523Test {
    private static final String FILE_NAME = "Data523.txt";
    private int[] longArray;

    @Before
    public void setUp() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(FILE_NAME)));
        longArray = Arrays.stream(reader.readLine().split(",")).mapToInt(s -> Integer.parseInt(s.trim())).toArray();
    }

    @Test
    public void checkSubarraySum() throws Exception {
        assertTrue(new Solution523().checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        assertTrue(new Solution523().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        assertFalse(new Solution523().checkSubarraySum(new int[]{1, 2}, 6));
        assertFalse(new Solution523().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 0));

        assertTrue(new Solution523().checkSubarraySum(new int[10000], 0));
        assertTrue(new Solution523().checkSubarraySum(new int[10000], 1));

        assertTrue(new Solution523().checkSubarraySum(new int[10000], 6));
        assertTrue(new Solution523().checkSubarraySum(new int[10000], 6));

        assertTrue(new Solution523().checkSubarraySum(longArray, 2147483640));
    }

    @Test
    public void checkSubarraySum2() throws Exception {
        assertTrue(new Solution523().checkSubarraySum2(new int[]{23, 2, 4, 6, 7}, 6));
        assertTrue(new Solution523().checkSubarraySum2(new int[]{23, 2, 6, 4, 7}, 6));
        assertFalse(new Solution523().checkSubarraySum2(new int[]{1, 2}, 6));
        assertFalse(new Solution523().checkSubarraySum2(new int[]{23, 2, 6, 4, 7}, 0));

        assertTrue(new Solution523().checkSubarraySum2(new int[10000], 0));
        assertTrue(new Solution523().checkSubarraySum2(new int[10000], 1));

        assertTrue(new Solution523().checkSubarraySum2(new int[10000], 6));
        assertTrue(new Solution523().checkSubarraySum2(new int[10000], 6));

        assertTrue(new Solution523().checkSubarraySum2(longArray, 2147483640));
    }
}