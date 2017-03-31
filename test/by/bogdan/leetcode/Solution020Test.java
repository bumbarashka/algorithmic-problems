package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution020Test {
    @Test
    public void isValid() throws Exception {
        assertFalse(new Solution020().isValid(null));
        assertFalse(new Solution020().isValid("("));
        assertFalse(new Solution020().isValid("["));
        assertFalse(new Solution020().isValid("{"));
        assertFalse(new Solution020().isValid("}"));
        assertFalse(new Solution020().isValid("]"));
        assertFalse(new Solution020().isValid(")"));
        assertFalse(new Solution020().isValid("(]"));
        assertFalse(new Solution020().isValid("([)]"));
        assertFalse(new Solution020().isValid("(([)])"));

        assertTrue(new Solution020().isValid(""));
        assertTrue(new Solution020().isValid("()[]{}"));
        assertTrue(new Solution020().isValid("{(()[()]{[]})}"));
    }

}