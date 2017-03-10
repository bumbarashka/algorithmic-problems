package by.bogdan.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class Solution3Test {
    private static final String DATA_FILE_NAME = "Data3.txt";
    private static String longString;

    @Before
    public void setUp() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream(DATA_FILE_NAME)));
        longString = reader.readLine();
    }

    @Test
    public void lengthOfLongestSubstring() throws Exception {
        assertEquals(3, new Solution3().lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, new Solution3().lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, new Solution3().lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, new Solution3().lengthOfLongestSubstring("c"));
        assertEquals(5, new Solution3().lengthOfLongestSubstring("abcde"));
        assertEquals(0, new Solution3().lengthOfLongestSubstring(""));
        assertEquals(0, new Solution3().lengthOfLongestSubstring(null));
        assertEquals(95, new Solution3().lengthOfLongestSubstring(longString));
    }
}