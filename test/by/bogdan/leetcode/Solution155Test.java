package by.bogdan.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution155Test {
    @Test
    public void testStack() throws Exception {
        Solution155 stack = new Solution155();
        stack.push(1);
        assertEquals(1, stack.getMin());
        assertEquals(1, stack.top());
        stack.push(2);
        assertEquals(1, stack.getMin());
        assertEquals(2, stack.top());
        stack.push(1);
        assertEquals(1, stack.getMin());
        assertEquals(1, stack.top());
        stack.push(-5);
        assertEquals(-5, stack.getMin());
        assertEquals(-5, stack.top());
        stack.pop();
        stack.pop();
        assertEquals(1, stack.getMin());
        assertEquals(2, stack.top());
        stack.pop();
        assertEquals(1, stack.getMin());
        assertEquals(1, stack.top());
    }

    @Test
    public void testStack2() throws Exception {
        Solution155 stack = new Solution155();
        stack.push(-2);
        assertEquals(-2, stack.getMin());
        assertEquals(-2, stack.top());
        stack.push(0);
        assertEquals(-2, stack.getMin());
        assertEquals(0, stack.top());
        stack.push(-1);
        assertEquals(-2, stack.getMin());
        assertEquals(-1, stack.top());
    }
}