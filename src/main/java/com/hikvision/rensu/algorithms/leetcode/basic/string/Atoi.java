package com.hikvision.rensu.algorithms.leetcode.basic.string;

import org.junit.Assert;
import org.junit.Test;

public class Atoi {
    public int myAtoi(String str) {
        long ret = 0;
        int positive = 1;
        int i = 0;

        if (str.length() == 0) return 0;

        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        if (i < str.length() && ((str.charAt(i) == '-' || str.charAt(i) == '+'))) {
            if (str.charAt(i) == '-') {
                positive = -1;
            }
            i++;
        }

        while (i < str.length()) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                ret = ret * 10 + (str.charAt(i) - '0');
                if (ret > Integer.MAX_VALUE) {
                    break;
                }
                i++;
            } else {
                break;
            }

        }

        ret *= positive;

        if (ret < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        if (ret > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) ret;
    }

    @Test
    public void test1() {
        String str = "42";
        Assert.assertEquals(42, new Atoi().myAtoi(str));
    }

    @Test
    public void test2() {
        String str = "   -42";
        Assert.assertEquals(-42, new Atoi().myAtoi(str));
    }

    @Test
    public void test3() {
        String str = "4193 with words";
        Assert.assertEquals(4193, new Atoi().myAtoi(str));
    }

    @Test
    public void test4() {
        String str = "words and 987";
        Assert.assertEquals(0, new Atoi().myAtoi(str));
    }

    @Test
    public void test5() {
        String str = "-91283472332";
        Assert.assertEquals(-2147483648, new Atoi().myAtoi(str));
    }

    @Test
    public void test6() {
        String str = "";
        Assert.assertEquals(0, new Atoi().myAtoi(str));
    }

    @Test
    public void test7() {
        String str = "-";
        Assert.assertEquals(0, new Atoi().myAtoi(str));
    }

    @Test
    public void test8() {
        String str = " ";
        Assert.assertEquals(0, new Atoi().myAtoi(str));
    }

    @Test
    public void test9() {
        String str = "-+1";
        Assert.assertEquals(0, new Atoi().myAtoi(str));
    }

    @Test
    public void test10() {
        String str = "9223372036854775808";
        Assert.assertEquals(2147483647, new Atoi().myAtoi(str));
    }
}
