package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution541Test {
    @Test
    public void reverseStr() throws Exception {
        assertEquals("bacdfeg", new Solution541().reverseStr("abcdefg", 2));
        assertEquals("bacdfegz", new Solution541().reverseStr("abcdefgz", 2));
        assertEquals("bacdfe", new Solution541().reverseStr("abcdef", 2));
        assertEquals("bacde", new Solution541().reverseStr("abcde", 2));
        assertEquals("edcba", new Solution541().reverseStr("abcde", 7));
        assertEquals("abcde", new Solution541().reverseStr("abcde", 1));
    }

}