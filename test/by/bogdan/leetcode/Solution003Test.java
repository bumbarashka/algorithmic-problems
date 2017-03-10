package by.bogdan.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class Solution003Test {
    private static final String DATA_FILE_NAME = "Data003.txt";
    private static String longString;

    @Before
    public void setUp() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream(DATA_FILE_NAME)));
        longString = reader.readLine();
    }

    @Test
    public void lengthOfLongestSubstring() throws Exception {
        assertEquals(3, new Solution003().lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, new Solution003().lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, new Solution003().lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, new Solution003().lengthOfLongestSubstring("c"));
        assertEquals(5, new Solution003().lengthOfLongestSubstring("abcde"));
        assertEquals(0, new Solution003().lengthOfLongestSubstring(""));
        assertEquals(0, new Solution003().lengthOfLongestSubstring(null));
        assertEquals(95, new Solution003().lengthOfLongestSubstring(longString));
    }
}