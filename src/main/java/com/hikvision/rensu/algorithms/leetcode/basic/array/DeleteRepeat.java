package com.hikvision.rensu.algorithms.leetcode.basic.array;

import org.junit.Assert;
import org.junit.Test;

public class DeleteRepeat {
    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     */


    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int k = nums[i];
            for (int j = i + 1; j < len; j++) {
                if (k == nums[j]) {
                    len--;
                    j-=1;
                    for (int t = j; t < len; t++) {
                        nums[t] = nums[t + 1];
                    }
                }
            }
        }
        return len;
    }

    @Test
    public void testThis() {
        int[] a = {1, 1, 1, 2, 3,3,3, 4, 4, 6, 7, 8};
        DeleteRepeat t = new DeleteRepeat();
        Assert.assertEquals(7, t.removeDuplicates(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
