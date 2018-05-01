package com.hikvision.rensu.algorithms.leetcode.basic.string;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        int lo = 0;
        int hi = s.length() - 1;

        boolean f = true;

        while (lo <= hi) {
            while (!((t.charAt(lo) >= '0' && t.charAt(lo) <= '9') || (t.charAt(lo) >= 'a' && t.charAt(lo) <= 'z'))) {
                lo++;
                if (lo > s.length() - 1) {
                    lo--;
                    break;
                }
            }

            while (!((t.charAt(hi) >= '0' && t.charAt(hi) <= '9') || (t.charAt(hi) >= 'a' && t.charAt(hi) <= 'z'))) {
                hi--;
                if (hi < 0) {
                    hi++;
                    break;
                }
            }


            if (t.charAt(lo) != t.charAt(hi) && ((t.charAt(hi) >= '0' && t.charAt(hi) <= '9') || (t.charAt(hi) >= 'a' && t.charAt(hi) <= 'z')) && ((t.charAt(lo) >= '0' && t.charAt(lo) <= '9') || (t.charAt(lo) >= 'a' && t.charAt(lo) <= 'z'))) {
                f = false;
                break;
            } else {
                lo++;
                hi--;
            }
        }

        return f;
    }

    @Test
    public void test1() {
        String s = "A man, a plan, a canal: Panama";
        Assert.assertTrue(new IsPalindrome().isPalindrome(s));
    }

    @Test
    public void test2() {
        String s = "race a car";
        Assert.assertFalse(new IsPalindrome().isPalindrome(s));
    }

    @Test
    public void test3() {
        String s = " ";
        Assert.assertTrue(new IsPalindrome().isPalindrome(s));
    }

    @Test
    public void test4() {
        String s = ".,";
        Assert.assertTrue(new IsPalindrome().isPalindrome(s));
    }
}
