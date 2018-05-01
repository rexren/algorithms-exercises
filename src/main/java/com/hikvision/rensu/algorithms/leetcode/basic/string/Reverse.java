package com.hikvision.rensu.algorithms.leetcode.basic.string;

import org.junit.Assert;
import org.junit.Test;

public class Reverse {
    public int reverse(int x) {
        int res = 0;
        while(x != 0){
            int val = x % 10;
            int tmp = res;
            res = tmp * 10 + val;
            x = x / 10;
            if(res / 10 != tmp) return 0;
        }
        return res;
    }

    @Test
    public void test(){
        Assert.assertEquals(-1234, new Reverse().reverse(-4321));
    }
}
