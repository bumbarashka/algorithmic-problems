package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution208Test {
    @Test
    public void testTrieSearch() throws Exception {
        Solution208 obj = new Solution208();
        obj.insert("test");
        assertTrue(obj.search("test"));
        assertFalse(obj.search("testlong"));
        assertFalse(obj.search("te"));
        assertFalse(obj.search(""));
    }

    @Test
    public void testTrieStartsWith() throws Exception {
        Solution208 obj = new Solution208();
        obj.insert("test");
        obj.insert("ted");
        obj.insert("tests");

        assertTrue(obj.startsWith(""));
        assertTrue(obj.startsWith("t"));
        assertTrue(obj.startsWith("te"));
        assertTrue(obj.startsWith("ted"));
        assertTrue(obj.startsWith("tests"));
        assertFalse(obj.startsWith("a"));
        assertFalse(obj.startsWith("ter"));
    }
}