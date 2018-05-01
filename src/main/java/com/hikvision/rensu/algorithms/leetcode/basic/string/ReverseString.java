package com.hikvision.rensu.algorithms.leetcode.basic.string;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString {
    public String reverseString(String s) {
        char[] tmp = s.toCharArray();
        int len = s.length() / 2;
        for (int i = 0; i < len; i++) {
            char t = tmp[i];
            tmp[i] = tmp[s.length() - i - 1];
            tmp[s.length() - i - 1] = t;
        }
        return String.copyValueOf(tmp);
    }

    public String reverseString2(String s) {
        char[] tmp = s.toCharArray();
        int lo = 0, hi = s.length();
        while (lo < hi) {
            char t = tmp[lo];
            tmp[lo] = tmp[hi - 1];
            tmp[hi - 1] = t;
            lo++;
            hi--;
        }


        return String.copyValueOf(tmp);
    }

    @Test
    public void test() {
        Assert.assertEquals("ollehq", new ReverseString().reverseString2("qhello"));
    }
}
