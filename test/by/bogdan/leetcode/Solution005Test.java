package by.bogdan.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class Solution005Test {
    private final static String FILE_INPUT = "Data005-input.txt";
    private final static String FILE_RESULT = "Data005-result.txt";
    private String longLine;
    private String resultLine;

    @Before
    public void setUp() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(FILE_INPUT)))) {
            longLine = reader.readLine();
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(FILE_RESULT)))) {
            resultLine = reader.readLine();
        }
    }

    @Test
    public void longestPalindrome() throws Exception {
        assertEquals(null, new Solution005().longestPalindrome(null));
        assertEquals(null, new Solution005().longestPalindrome(""));
        assertEquals("a", new Solution005().longestPalindrome("a"));
        assertEquals("a", new Solution005().longestPalindrome("ab"));
        assertEquals(resultLine, new Solution005().longestPalindrome(longLine));
    }
}