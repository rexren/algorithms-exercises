package com.hikvision.rensu.algorithms.leetcode.basic.array;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        if (testFull(digits)) {
            int[] dit = new int[digits.length + 1];
            dit[0] = 1;
            return dit;
        }

        boolean marker = false;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                if (marker) {
                    digits[i] = 0;
                } else {
                    if (i == digits.length-1) {
                        digits[i] = 0;
                        marker = true;
                        continue;
                    }
                    break;
                }
            } else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }

    private boolean testFull(int[] dig) {
        for (int i = 0; i < dig.length; i++) {
            if (dig[i] != 9) return false;
        }
        return true;
    }
}
