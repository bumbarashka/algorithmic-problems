package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.Interval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Solution for 'Merge Intervals' algorithmic problem.
 * Given a collection of intervals, merge all overlapping intervals
 *
 * @see <a href="https://leetcode.com/problems/merge-intervals">56. Merge Intervals (on leetcode.com)</a>
 */
public class Solution056 {
    /**
     * @param intervals a collection of intervals
     * @return a collection of all overlapping intervals
     */
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return new ArrayList<>();
        }
        List<Interval> result = new LinkedList<>();
        intervals.sort(Comparator.comparingInt(i -> i.start));

        Interval joinedInterval = new Interval(intervals.get(0).start, intervals.get(0).end);
        for (Interval interval : intervals) {
            if (joinedInterval.end < interval.start) {
                result.add(joinedInterval);
                joinedInterval = new Interval(interval.start, interval.end);
            } else if (joinedInterval.end < interval.end) {
                joinedInterval.end = interval.end;
            }
        }
        result.add(joinedInterval);
        return result;
    }
}
