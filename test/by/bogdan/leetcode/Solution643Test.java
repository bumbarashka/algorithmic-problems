package by.bogdan.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link Solution643}
 */
public class Solution643Test {
    @Test
    public void findMaxAverage() throws Exception {
        assertThat(new Solution643().findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4), is(12.75));
    }

}