package study.leetcode.DataStructure.I;

import java.time.LocalDate;
import java.util.*;

public class ArrayDS {

    public Boolean _217_ContainsDuplicate(Integer[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }

    public int _53MaximumSubarray(Integer[] nums) {
        int curSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += nums[i];
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
