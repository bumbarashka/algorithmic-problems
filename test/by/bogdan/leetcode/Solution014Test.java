package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution014Test {
    @Test
    public void longestCommonPrefix() throws Exception {
        assertEquals("", new Solution014().longestCommonPrefix(new String[0]));
        assertEquals("", new Solution014().longestCommonPrefix(null));
        assertEquals("abc", new Solution014().longestCommonPrefix(new String[]{"abc"}));
        assertEquals("a", new Solution014().longestCommonPrefix(new String[]{"aa", "a"}));
        assertEquals("", new Solution014().longestCommonPrefix(new String[]{"abc", "dbd", "test", "one"}));
        assertEquals("", new Solution014().longestCommonPrefix(new String[]{""}));
        assertEquals("abc", new Solution014().longestCommonPrefix(new String[]{"abcdefg", "abc", "abcdf", "abcdk"}));
        assertEquals("a", new Solution014().longestCommonPrefix(new String[]{"abcdefg", "abc", "abcdf", "aabcdek"}));
    }

}