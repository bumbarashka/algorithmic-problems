package by.bogdan.leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Solution for 'Minimum Time Difference' algorithmic problem.
 * Given a list of 24-hour clock time points in "Hour:Minutes" format, find the minimum minutes difference between any two time points in the list.
 * Note:
 * <ul>
 * <li>The number of time points in the given list is at least 2 and won't exceed 20000.</li>
 * <li>The input time is legal and ranges from 00:00 to 23:59.</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-difference">539. Minimum Time Difference (on leetcode.com)</a>
 */
public class Solution539 {
    /**
     * This method uses sorted set to keep sorted time points. If number of time points is close to number of minutes in a day
     * or greater it is better to use array instead of sorted set.
     * Efficiency O(n * log(n)). Memory usage O(n).
     *
     * @param timePoints a list of 24-hour clock time points in "Hour:Minutes" format
     * @return the minimum minutes difference between any two time points in the list
     * @see Solution539#findMinDifference2(List)
     */
    public int findMinDifference(List<String> timePoints) {
        SortedSet<Integer> set = new TreeSet<>();
        for (String timePoint : timePoints) {
            String[] hourAndMinute = timePoint.split(":");
            Integer value = Integer.valueOf(hourAndMinute[0]) * 60 + Integer.valueOf(hourAndMinute[1]);
            if (set.contains(value)) {
                return 0;
            }
            set.add(value);
        }

        Iterator<Integer> it = set.iterator();
        Integer prev = it.next();
        Integer minDist = prev + 1440 - set.last();
        while (it.hasNext()) {
            Integer current = it.next();
            Integer dist = current - prev;
            prev = current;
            if (dist < minDist) {
                minDist = dist;
            }
        }
        return minDist;
    }

    /**
     * This method uses array to keep time points. It is good solution for arrays with huge number of time points.
     * Efficiency O(n). Memory usage O(1) = number of minutes in a day.
     *
     * @param timePoints a list of 24-hour clock time points in "Hour:Minutes" format
     * @return the minimum minutes difference between any two time points in the list
     */
    public int findMinDifference2(List<String> timePoints) {
        boolean[] minutes = new boolean[24 * 60]; // 24 * 60 = minutes in day
        for (String timePoint : timePoints) {
            String[] hourAndMinute = timePoint.split(":");
            int value = Integer.parseInt(hourAndMinute[0]) * 60 + Integer.valueOf(hourAndMinute[1]);
            if (minutes[value]) {
                return 0;
            }
            minutes[value] = true;
        }

        int i = 0;
        int first;
        while (true) {
            if (minutes[i]) {
                first = i;
                break;
            }
            i++;
        }
        i = minutes.length - 1;
        int last;
        while (true) {
            if (minutes[i]) {
                last = i;
                break;
            }
            i--;
        }
        int minDist = first + minutes.length - last;
        int prev = first;
        for (i = first + 1; i <= last; i++) {
            if (minutes[i]) {
                int dist = i - prev;
                if (dist < minDist) {
                    minDist = dist;
                }
                prev = i;
            }
        }
        return minDist;
    }
}
