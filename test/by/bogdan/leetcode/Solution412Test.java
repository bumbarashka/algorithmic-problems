package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution412Test {
    @Test
    public void fizzBuzz() throws Exception {
        assertArrayEquals(new String[]{
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
        }, new Solution412().fizzBuzz(15).toArray());
    }
}