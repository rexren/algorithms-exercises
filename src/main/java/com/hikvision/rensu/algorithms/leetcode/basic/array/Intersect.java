package com.hikvision.rensu.algorithms.leetcode.basic.array;


import org.junit.Test;

import java.util.Arrays;

public class Intersect {
    /**
     * 给定两个数组，写一个方法来计算它们的交集。
     * <p>
     * 例如:
     * 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
     * <p>
     * 注意：
     * <p>
     * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
     * 我们可以不考虑输出结果的顺序。
     * 跟进:
     * <p>
     * 如果给定的数组已经排好序呢？你将如何优化你的算法？
     * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
     * 如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
     *
     * @param nums1
     * @param nums2
     * @return
     */


    public int[] intersect(int[] nums1, int[] nums2) {

        int[] longArray;
        int[] shortArry;
        int[] used;

        if (nums1.length >= nums2.length) {
            longArray = nums1;
            shortArry = nums2;
            used = new int[nums2.length];
        } else {
            longArray = nums2;
            shortArry = nums1;
            used = new int[nums1.length];
        }

        Arrays.fill(used, -1);

        int[] inter = new int[shortArry.length];
        int t = 0;

        for (int i = 0; i < shortArry.length; i++) {
            for (int j = 0; j < longArray.length; j++) {
                if (shortArry[i] == longArray[j]) {
                    if (!hasMark(j, used)) {
                        inter[t] = shortArry[i];
                        used[t] = j;
                        t++;
                        break;
                    }
                }
            }
        }

        int[] f = new int[t];
        for (int i = 0; i < t; i++) {
            f[i] = inter[i];
        }
        return f;
    }

    //find a same element, search inter for same one.
    private boolean hasMark(int num, int[] t) {

        for (int k = 0; k < t.length; k++) {
            if (num == t[k]) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testThis() {

        int[] a = {2, 1};
        int[] b = {1, 1};

        Intersect t = new Intersect();
        int[] k = t.intersect(a, b);
    }

}
