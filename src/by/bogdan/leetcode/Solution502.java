package by.bogdan.leetcode;

import java.util.*;

/**
 * Solution for https://leetcode.com/problems/ipo/
 */
public class Solution502 {

    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        if (k == 0 || Profits.length == 0 || Capital.length == 0) {
            return W;
        }
        PriorityQueue<Integer> queueProfits = new PriorityQueue<>((p1, p2) -> p2 - p1);
        PriorityQueue<int[]> queueCapital = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int currentW = W;
        for (int i = 0; i < Capital.length; i++) {
            if (Capital[i] <= currentW) {
                queueProfits.offer(Profits[i]);
            } else {
                queueCapital.offer(new int[]{Capital[i], Profits[i]});
            }
        }
        for (int i = 0; i < k; i++) {
            Integer maxProfit = queueProfits.poll();
            if (maxProfit == null) {
                break;
            }
            currentW += maxProfit;
            while (!queueCapital.isEmpty() && currentW >= queueCapital.peek()[0]) {
                queueProfits.offer(queueCapital.poll()[1]);
            }
        }
        return currentW;
    }
}
