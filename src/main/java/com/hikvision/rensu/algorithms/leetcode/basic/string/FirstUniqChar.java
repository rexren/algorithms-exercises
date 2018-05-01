package com.hikvision.rensu.algorithms.leetcode.basic.string;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqChar {
    public int firstUniqChar(String s) {

        if (s.length()==0) return 0;

        int[] counter = new int[26];
        for (int i = 0; i < 26; i++) {
            counter[i] = -1;
        }

        for (int i = 0; i < s.length(); ++i) {
            int k = s.charAt(i) - 'a';
            if (counter[k] == -1) {
                counter[k] = 0;
            }
            ++counter[k];
        }

        for (int i = 0; i < s.length(); ++i) {
            if (1 == counter[s.charAt(i) - 'a'])
                return i;
        }

        return -1;
    }


    @Test
    public void test() {
        Assert.assertEquals(-1, new FirstUniqChar().firstUniqChar("cc"));
    }
}
