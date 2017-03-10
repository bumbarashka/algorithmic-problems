package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution9Test {
    @Test
    public void isPalindrome() throws Exception {
        assertTrue(new Solution9().isPalindrome(123321));
        assertTrue(new Solution9().isPalindrome(121));
        assertTrue(new Solution9().isPalindrome(1));
        assertFalse(new Solution9().isPalindrome(-1));
        assertTrue(new Solution9().isPalindrome(0));
        assertFalse(new Solution9().isPalindrome(123));
        assertFalse(new Solution9().isPalindrome(Integer.MAX_VALUE));
        assertFalse(new Solution9().isPalindrome(Integer.MIN_VALUE));
        assertFalse(new Solution9().isPalindrome(1000021));
    }

}