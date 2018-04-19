package com.hikvision.rensu.algorithms.leetcode.basic.array;

import org.junit.Assert;
import org.junit.Test;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0){
                for (int j = i; j < len-1; j++) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
                len--;
                i--;
            }
        }
    }

    @Test
    public void testThis() {

        int[] a = {0,0,1};
        int[] b = {1,0,0};
        MoveZero t = new MoveZero();
        t.moveZeroes(a);
        Assert.assertArrayEquals(b, a);
    }
}
