package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/plus-one
 */
public class Solution066 {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0 && digits[i] == 9) {
            i--;
        }
        if (i == -1) {
            int[] array = new int[digits.length + 1];
            array[0] = 1;
            return array;
        } else {
            int[] array = new int[digits.length];
            for (int j = 0; j < i; j++) {
                array[j] = digits[j];
            }
            array[i] = digits[i] + 1;
            return array;
        }
    }
}
