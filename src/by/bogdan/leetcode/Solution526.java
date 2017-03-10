package by.bogdan.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Solution for https://leetcode.com/problems/beautiful-arrangement
 */
public class Solution526 {
    public int countArrangement(int N) {
        if (N < 1 || 15 < N) {
            return 0;
        }
        Queue<Integer> availablePositions = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            availablePositions.add(i);
        }
        return dfs(N, availablePositions);
    }

    private Integer dfs(int n, Queue<Integer> availablePositions) {
        if (n == 0) {
            return 1;
        }
        int counter = 0;
        int i = availablePositions.size();
        while (i-- > 0) {
            Integer position = availablePositions.poll();
            if (n % position == 0 || position % n == 0) {
                counter += dfs(n - 1, availablePositions);
            }
            availablePositions.offer(position);
        }
        return counter;
    }
}
