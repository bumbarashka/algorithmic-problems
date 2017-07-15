package by.bogdan.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Unit test for {@link Solution633}
 */
public class Solution633Test {
    @Test
    public void judgeSquareSum() throws Exception {
        assertThat(new Solution633().judgeSquareSum(0), is(true));
        assertThat(new Solution633().judgeSquareSum(1), is(true));
        assertThat(new Solution633().judgeSquareSum(2), is(true));
        assertThat(new Solution633().judgeSquareSum(3), is(false));
        assertThat(new Solution633().judgeSquareSum(4), is(true));
        assertThat(new Solution633().judgeSquareSum(5), is(true));
        assertThat(new Solution633().judgeSquareSum(48), is(false));
        assertThat(new Solution633().judgeSquareSum(50), is(true));
        System.out.println(System.currentTimeMillis());
        assertThat(new Solution633().judgeSquareSum(Integer.MAX_VALUE), is(false));
        System.out.println(System.currentTimeMillis());
    }

}