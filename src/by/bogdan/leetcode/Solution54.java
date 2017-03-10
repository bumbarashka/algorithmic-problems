package by.bogdan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for https://leetcode.com/problems/spiral-matrix
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        int counter = m * n;
        int top = -1;
        int right = n;
        int bottom = m;
        int left = -1;
        int directionI = 0;
        int directionJ = 1;
        while (counter-- > 0) {
            list.add(matrix[i][j]);
            if (directionJ == 1 && j + directionJ == right) {
                directionI = 1;
                directionJ = 0;
                top++;
            } else if (directionJ == -1 && j + directionJ == left) {
                directionI = -1;
                directionJ = 0;
                bottom--;
            } else if (directionI == 1 && i + directionI == bottom) {
                directionI = 0;
                directionJ = -1;
                right--;
            } else if (directionI == -1 && i + directionI == top) {
                directionI = 0;
                directionJ = 1;
                left++;
            }
            i += directionI;
            j += directionJ;
        }
        return list;
    }
}
