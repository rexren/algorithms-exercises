package com.hikvision.rensu.algorithom.chapter1;

/**
 * Created by rensu on 2017/6/18.
 */
public class Basic {

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println("The 6,4 gcd is " + gcd(6, 4));
    }
}
