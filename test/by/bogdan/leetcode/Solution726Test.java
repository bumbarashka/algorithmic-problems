package by.bogdan.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Unit test for {@link Solution726}
 */
public class Solution726Test {
    @Test
    public void countOfAtoms() throws Exception {
        assertThat(new Solution726().countOfAtoms("H"), equalTo("H"));
        assertThat(new Solution726().countOfAtoms("H2O"), equalTo("H2O"));
        assertThat(new Solution726().countOfAtoms("Mg(OH)2"), equalTo("H2MgO2"));
        assertThat(new Solution726().countOfAtoms("K4(ON(SO3)2)2"), equalTo("K4N2O14S4"));
        assertThat(new Solution726().countOfAtoms("(K4(ON(SO3)2)2)"), equalTo("K4N2O14S4"));
    }

}