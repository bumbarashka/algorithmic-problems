package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution514Test {
    @Test
    public void findRotateSteps2() throws Exception {
        assertEquals(4, new Solution514().findRotateSteps2("godding", "gd"));
        assertEquals(204, new Solution514().findRotateSteps2("xrrakuulnczywjs", "jrlucwzakzussrlckyjjsuwkuarnaluxnyzcnrxxwruyr"));
        assertEquals(6, new Solution514().findRotateSteps2("abcde", "ade"));
        assertEquals(137, new Solution514().findRotateSteps2("caotmcaataijjxi", "oatjiioicitatajtijciocjcaaxaaatmctxamacaamjjx"));
    }
}