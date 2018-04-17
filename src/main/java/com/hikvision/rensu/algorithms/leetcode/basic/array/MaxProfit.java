package com.hikvision.rensu.algorithms.leetcode.basic.array;

import org.junit.Assert;
import org.junit.Test;

public class MaxProfit {

    /**
     * 假设有一个数组，它的第 i 个元素是一个给定的股票在第 i 天的价格。
     * 设计一个算法来找到最大的利润。你可以完成尽可能多的交易（多次买卖股票）。然而，你不能同时参与多个交易（你必须在再次购买前出售股票）。
     */

    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int lo = findNerstLow(prices, i);
            int hi = findNextHigh(prices, i);

            if (lo < hi) {
                profit += (prices[hi] - prices[lo]);
                i = hi;
            }
        }

        return profit;
    }

    private int findNerstLow(int[] p, int i) {
        int k = p[i];
        int pos = i;
        for (int j = i; j < p.length; j++) {
            if (p[j] <= k) {
                k = p[j];
                pos = j;
            } else {
                break;
            }
        }
        return pos;
    }

    private int findNextHigh(int[] p, int i) {
        int k = p[i];
        int pos = i;
        for (int j = i; j < p.length; j++) {
            if (p[j] >= k) {
                k = p[j];
                pos = j;
            } else {
                break;
            }
        }
        return pos;
    }

    @Test
    public void testThis() {
        int[] a = {2,1,4};
        MaxProfit t = new MaxProfit();
        Assert.assertEquals(3, t.maxProfit(a));
    }
}
