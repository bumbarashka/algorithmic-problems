package by.bogdan.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution189Test {
    @Test
    public void rotate() throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new Solution189().rotate(nums, 3);
        System.out.print(Arrays.toString(nums));
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }
}