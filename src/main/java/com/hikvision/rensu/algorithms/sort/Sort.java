package com.hikvision.rensu.algorithms.sort;

public interface Sort {

    void sort(Comparable[] a);

    boolean less(Comparable p, Comparable q);

    void exch(Comparable[] a, int p, int q);

    boolean isSorted(Comparable[] a);

    void display(Comparable[] a);

}
