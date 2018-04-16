package com.hikvision.rensu.algorithms.sort;

public class QS2 extends AbstractSort{
    @Override
    public void sort(Comparable[] a) {

    }

    void qs(Comparable[]a, int lo, int hi){
        if (lo<hi){
            int p = pation(a, lo, hi);
            qs(a, lo, p-1);
            qs(a, p+1, hi);
        }
    }

    int pation(Comparable[]a, int lo, int hi){
        
    }
}
