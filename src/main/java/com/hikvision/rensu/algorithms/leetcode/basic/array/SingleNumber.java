package com.hikvision.rensu.algorithms.leetcode.basic.array;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber {
    /**
     * 给定一个整数数组，除了某个元素外其余元素均出现两次。请找出这个只出现一次的元素。
     *
     * @param nums
     * @return once number
     */
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length <= 2) {
            throw new IllegalArgumentException("nums size must bigger than 2");
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }

    @Test
    public void testThis() {
        int k = 3^2^2^4^4;

        int[] a = {3, 3, 2, 1, 1, 4, 4};
        SingleNumber t = new SingleNumber();
        Assert.assertEquals(2, t.singleNumber(a));
    }
}
