package com.hikvision.rensu.algorithms.sort;

public abstract class AbstractSort implements Sort {
    @Override
    public boolean less(Comparable p, Comparable q) {
        return p.compareTo(q) < 0;
    }

    @Override
    public void exch(Comparable[] a, int p, int q) {
        Comparable tmp = a[p];
        a[p] = a[q];
        a[q] = tmp;
    }

    @Override
    public boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].compareTo(a[i + 1]) >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void display(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
