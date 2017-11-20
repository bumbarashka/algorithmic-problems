package by.bogdan.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Unit test for {@link Solution046}
 */
public class Solution046Test {
    @Test
    public void permute() throws Exception {
        assertThat(new Solution046().permute(new int[]{1, 2, 3}), equalTo(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
                )));
    }

}