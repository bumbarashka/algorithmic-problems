package by.bogdan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for https://leetcode.com/problems/keyboard-row/
 */
public class Solution500 {

    public static int[] LETTER_GROUPS = {2, 4, 4, 2, 1, 2, 2, 2, 1, 2, 2, 2, 4, 4, 1, 1, 1, 1, 2, 1, 1, 4, 1, 4, 1, 4};


    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isWordFromOneRowLetters(word.toLowerCase())) {
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);

    }

    private boolean isWordFromOneRowLetters(String word) {
        int result = LETTER_GROUPS[(int) word.charAt(0) - 97];
        int i = 1;
        while ((result == 1 || result == 2 || result == 4) && i < word.length()) {
            result = result | LETTER_GROUPS[(int) word.charAt(i) - 97];
            i++;
        }
        return result == 1 || result == 2 || result == 4;
    }
}
