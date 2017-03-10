package by.bogdan.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Solution524Test {
    @Test
    public void findLongestWord() throws Exception {
        assertEquals("apple", new Solution524().findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea")));
        assertEquals("a", new Solution524().findLongestWord("abpcplea", Arrays.asList("a", "b", "c")));
    }
}