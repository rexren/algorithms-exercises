package com.hikvision.rensu.algorithms.leetcode.basic.array;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] c = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    c[0] = i;
                    c[1] = j;
                }
            }
        }
        return c;
    }

    @Test
    public void testThis() {

        int[] a = {2, 7, 11, 15};
        int[] b = {0, 1};
        TwoSum t = new TwoSum();
        int[] c = t.twoSum(a, 9);
        Assert.assertArrayEquals(b, c);
    }
}
