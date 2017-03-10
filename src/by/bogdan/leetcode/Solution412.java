package by.bogdan.leetcode;

import java.util.List;
import java.util.ArrayList;

/**
 * Solution for https://leetcode.com/problems/fizz-buzz/
 */
public class Solution412 {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";

    public List<String> fizzBuzz(int n) {
        List result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            if (isFizz && isBuzz) {
                result.add(FIZZBUZZ);
            } else if (isFizz) {
                result.add(FIZZ);
            } else if (isBuzz) {
                result.add(BUZZ);
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
