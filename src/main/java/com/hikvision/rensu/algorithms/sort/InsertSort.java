package com.hikvision.rensu.algorithms.sort;

public class InsertSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

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

    public static void main(String[] args) {
        Integer a[] = {2, 4, 1, 56, 7, 78, 8, 96, 55, 432};

        Sort s = new InsertSort();
        s.sort(a);

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
