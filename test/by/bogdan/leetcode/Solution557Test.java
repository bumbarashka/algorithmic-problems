package by.bogdan.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 *  Unit tests for {@link Solution557}
 */
public class Solution557Test {
    @Test
    public void reverseWords() throws Exception {
        assertThat(new Solution557().reverseWords("Let's take LeetCode contest"), equalTo("s'teL ekat edoCteeL tsetnoc"));
    }

}