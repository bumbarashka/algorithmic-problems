package by.bogdan.leetcode;

import by.bogdan.leetcode.auxiliary.Interval;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution056Test {
    private static final String FILE_INPUT = "Data056-input.txt";

    private List<Interval> intervals;
    private List<Interval> joinedIntervals;
    private List<Interval> longIntervals;
    private List<Interval> longJoinedIntervals;

    @Before
    public void setUp() throws Exception {
        intervals = new ArrayList<>();
        intervals.add(new Interval(15, 18));
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));

        joinedIntervals = new ArrayList<>();
        joinedIntervals.add(new Interval(1, 6));
        joinedIntervals.add(new Interval(8, 10));
        joinedIntervals.add(new Interval(15, 18));

        longIntervals = parseList(FILE_INPUT);
        longJoinedIntervals = new ArrayList<>();
        longJoinedIntervals.add(new Interval(0, 103));
    }

    @Test
    public void merge() throws Exception {
        long start = System.currentTimeMillis();
        assertEquals(new ArrayList<Interval>(), new Solution056().merge(null));
        assertEquals(new ArrayList<Interval>(), new Solution056().merge(new ArrayList<>()));
        assertEquals(joinedIntervals, new Solution056().merge(intervals));
        assertEquals(longJoinedIntervals, new Solution056().merge(longIntervals));
        System.out.println(System.currentTimeMillis() - start);
    }

    private List<Interval> parseList(String fileName) throws Exception {
        List<Interval> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileName)))) {
            String line = reader.readLine();
            for(String s : line.substring(2, line.length() - 2).split("\\],\\[")) {
                String[] interval = s.split(",");
                result.add(new Interval(Integer.parseInt(interval[0]), Integer.parseInt(interval[1])));
            }
        }
        return result;
    }
}