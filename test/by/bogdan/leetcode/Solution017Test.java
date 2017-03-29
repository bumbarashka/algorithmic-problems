package by.bogdan.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class Solution017Test {
    @Test
    public void letterCombinations() throws Exception {
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), new Solution017().letterCombinations("23"));
        assertEquals(Arrays.asList("g", "h", "i"), new Solution017().letterCombinations("4"));
        assertEquals(new ArrayList(), new Solution017().letterCombinations(null));
        assertEquals(new ArrayList(), new Solution017().letterCombinations(""));
    }

}