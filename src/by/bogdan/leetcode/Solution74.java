package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/search-a-2d-matrix
 */
public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int numCols = matrix[0].length;
        int low = 0;
        int hi = matrix.length * numCols - 1;
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            int midNum = matrix[mid / numCols][mid % numCols];
            if (target < midNum) {
                hi = mid;
            } else if (midNum < target) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return matrix[low / numCols][low % numCols] == target;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int low = 0;
        int hi = numRows - 1;
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            if (target < matrix[mid][numCols - 1]) {
                hi = mid;
            } else if (target > matrix[mid][numCols - 1]) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return searchRow(matrix[low], target);
    }

    private boolean searchRow(int[] row, int target) {
        int low = 0;
        int hi = row.length - 1;
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            if (target < row[mid]) {
                hi = mid;
            } else if (target > row[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return row[low] == target;
    }
}
