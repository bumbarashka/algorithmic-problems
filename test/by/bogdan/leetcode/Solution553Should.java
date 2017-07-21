package by.bogdan.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Unit test for {@link Solution553}
 */
public class Solution553Should {
    @Test
    public void optimalDivision() throws Exception {
        assertThat(new Solution553().optimalDivision(new int[]{5}), equalTo("5"));
        assertThat(new Solution553().optimalDivision(new int[]{4, 2}), equalTo("4/2"));
        assertThat(new Solution553().optimalDivision(new int[]{10, 2, 3}), equalTo("10/(2/3)"));
        assertThat(new Solution553().optimalDivision(new int[]{1000, 100, 10, 2}), equalTo("1000/(100/10/2)"));
        assertThat(new Solution553().optimalDivision(new int[]{2, 10, 100, 1000, 12}), equalTo("2/(10/100/1000/12)"));
    }
}