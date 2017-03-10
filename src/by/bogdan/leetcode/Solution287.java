package by.bogdan.leetcode;

/**
 * Solution for https://leetcode.com/problems/find-the-duplicate-number
 */
public class Solution287 {
    // (n*log(n)) time and O(1) space
    public int findDuplicate(int[] nums) {
        int low = 1;
        int hi = nums.length - 1;
        while (low < hi) {
            int counterLeft = 0;
            int counterRight = 0;
            int counterMid = 0;
            double mid = low + (hi - low) / 2.0;
            for (int num : nums) {
                if (low <= num && num <= hi) {
                    if (num < mid) {
                        counterLeft++;
                    } else if (num > mid) {
                        counterRight++;
                    } else {
                        counterMid++;
                        if (counterMid > 1) {
                            return (int) mid;
                        }
                    }
                }
            }
            if (counterLeft > counterRight) {
                hi = (int) Math.floor(mid);
            } else {
                low = (int) Math.ceil(mid);
            }
        }
        return low;
    }

    // O(n) time and O(1) space.
    public int findDuplicate2(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (fast != slow) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (fast != slow) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
