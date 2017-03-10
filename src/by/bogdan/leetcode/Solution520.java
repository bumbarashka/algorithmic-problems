package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/detect-capital
 */
public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() < 2) {
            return true;
        }
        boolean isCorrect = true;
        Boolean isFirstUppercase = false;
        int i = 0;
        if (Character.isUpperCase(word.charAt(0))) {
            i = 1;
        }
        if (Character.isUpperCase(word.charAt(i++))) {
            isFirstUppercase = true;
        }
        while (isCorrect && i < word.length()) {
            if (Character.isUpperCase(word.charAt(i++)) != isFirstUppercase) {
                isCorrect = false;
            }
        }
        return isCorrect;
    }
}
