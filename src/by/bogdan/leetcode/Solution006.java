package by.bogdan.leetcode;

/**
 * Solution for 'ZigZag Conversion' algorithmic problem.
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <pre>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * </pre>
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * @see <a href="https://leetcode.com/problems/zigzag-conversion">6. ZigZag Conversion (on leetcode.com)</a>
 */
public class Solution006 {
    /**
     * This method reads zigzag string line by line.
     * Time complexity O(n). Space complexity is O(n).
     * @param s a given string written in a zigzag pattern.
     * @param numRows a given number of rows
     * @return zigzag string read line by line
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int maxShift = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            int j = i;
            int shift = 2 * (numRows - 1 - i);
            while (j < s.length()) {
                result.append(s.charAt(j));
                if (0 < shift && shift < maxShift && j + shift < s.length()) {
                    result.append(s.charAt(j + shift));
                }
                j += maxShift;
            }
        }
        return result.toString();
    }
}
