package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/diagonal-traverse/
 */
public class Solution498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[] indices = new int[]{0, 0};
        int[] result = new int[n * m];
        boolean isDirectionTop = true;
        for (int i = 0; i < m * n; ++i) {
            if (isDirectionTop) {
                if (canGoTop(m, indices)) {
                    result[i] = goTop(matrix, indices);
                } else {
                    result[i] = roundToBottom(matrix, indices);
                    isDirectionTop = false;
                }
            } else {
                if (canGoBottom(n, indices)) {
                    result[i] = goBottom(matrix, indices);
                } else {
                    result[i] = roundToTop(matrix, indices);
                    isDirectionTop = true;
                }
            }
        }
        return result;
    }

    public int[] findDiagonalOrder2(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length;

        int[] result = new int[m * n];
        int row = 0, col = 0, d = 1;

        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];
            row -= d;
            col += d;

            if (row >= m) {
                row = m - 1;
                col += 2;
                d = -d;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                d = -d;
            }
            if (row < 0) {
                row = 0;
                d = -d;
            }
            if (col < 0) {
                col = 0;
                d = -d;
            }
        }

        return result;
    }

    private int goTop(int[][] matrix, int[] indices) {
        int value = matrix[indices[0]][indices[1]];
        indices[0] -= 1;
        indices[1] += 1;
        return value;
    }

    private boolean canGoTop(int m, int[] indices) {
        return indices[0] - 1 >= 0 && indices[1] + 1 < m;
    }

    private int roundToBottom(int[][] matrix, int[] indices) {
        int value = matrix[indices[0]][indices[1]];
        if (indices[1] + 1 < matrix[0].length) {
            indices[1] += 1;
        } else {
            indices[0] += 1;
        }
        return value;
    }

    private int goBottom(int[][] matrix, int[] indices) {
        int value = matrix[indices[0]][indices[1]];
        indices[0] += 1;
        indices[1] -= 1;
        return value;
    }

    private boolean canGoBottom(int n, int[] indices) {
        return indices[0] + 1 < n && indices[1] - 1 >= 0;
    }

    private int roundToTop(int[][] matrix, int[] indices) {
        int value = matrix[indices[0]][indices[1]];
        if (indices[0] + 1 < matrix.length) {
            indices[0] += 1;
        } else {
            indices[1] += 1;
        }
        return value;
    }
}
