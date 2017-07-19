package by.bogdan.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link Solution561}
 */
public class Solution561Test {
    @Test
    public void arrayPairSum() throws Exception {
        assertThat(new Solution561().arrayPairSum(new int[]{1, 4, 3, 2}), is(4));
    }

}