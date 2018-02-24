package com.hikvision.rensu.algorithms.sort;

public class QuickSort extends AbstractSort {
    public static void main(String[] args) {
        Integer a[] = {2, 4, 1, 56, 7, 32, 435, 65436, 563, 432, 44, 6543, 6, 7, 2334, 5, 77, 88, 9, 35, 3444534};
        Sort s = new QuickSort();
        s.sort(a);

        s.display(a);
    }

    @Override
    public void sort(Comparable[] a) {
        qsort(a, 0, a.length - 1);
    }

    private void qsort(Comparable[] a, int lo, int hi) {
        if (lo < hi) {
            int j = partition(a, lo, hi);
            qsort(a, lo, j - 1);
            qsort(a, j + 1, hi);
        }
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
}
