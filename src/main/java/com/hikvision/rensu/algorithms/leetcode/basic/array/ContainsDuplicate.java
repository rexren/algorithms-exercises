package com.hikvision.rensu.algorithms.leetcode.basic.array;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (k == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    @Test
    public void testThis() {
        int[] a = {2, 1, 2};
        int[] b = {1, 2, 3};
        ContainsDuplicate t = new ContainsDuplicate();
        Assert.assertTrue(t.containsDuplicate(a));
        Assert.assertFalse(t.containsDuplicate(b));

    }
}
