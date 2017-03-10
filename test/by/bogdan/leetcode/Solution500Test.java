package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution500Test {
    @Test
    public void testFindWords() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        assertArrayEquals(new String[]{"Alaska", "Dad"}, new Solution500().findWords(words));
    }
}
