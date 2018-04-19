package com.hikvision.rensu.algorithms.leetcode.basic.array;

import org.junit.Assert;
import org.junit.Test;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int[] d = new int[nums.length];
        System.arraycopy(nums, 0, d, 0, nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = d[i];
        }
    }

    @Test
    public void testThis() {

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {5, 6, 7, 1, 2, 3, 4};
        Rotate t = new Rotate();
        t.rotate(a, 3);
        Assert.assertArrayEquals(b, a);
    }
}
