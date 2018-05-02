package com.hikvision.rensu.algorithms.leetcode.basic.string;

import org.junit.Assert;
import org.junit.Test;

public class Strstr {
    public int strStr(String haystack, String needle) {

        int ret = -1;

        if (haystack.length() < needle.length()) return -1;

        if (needle.length() == 0) return 0;

        for (int i = 0; i < haystack.length(); i++) {

            // we found first one!
            if (needle.charAt(0) == haystack.charAt(i)) {

                boolean f = true;

                // the length is not enough
                if (needle.length() > haystack.length() - i) return -1;

                for (int j = 0; j < needle.length(); j++) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        f = false;
                        break;
                    }
                }

                if (f) {
                    ret = i;
                    break;
                }
            }
        }

        return ret;
    }


    @Test
    public void test1() {
        String haystack = "hello", needle = "ll";
        Assert.assertEquals(2, strStr(haystack, needle));
    }

    @Test
    public void test2() {
        String haystack = "aaaaa", needle = "bba";
        Assert.assertEquals(-1, new Strstr().strStr(haystack, needle));
    }

    @Test
    public void test3() {
        String haystack = "aaaaa", needle = "";
        Assert.assertEquals(0, new Strstr().strStr(haystack, needle));
    }
}
