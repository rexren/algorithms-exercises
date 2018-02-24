package com.hikvision.rensu.algorithms.sort;

public class MergeSort extends AbstractSort {
    private Comparable[] aux;

    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        qsort(a, 0, a.length - 1);
    }

    private void qsort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        qsort(a, lo, mid);
        qsort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    //这里假定mid两边是已经排序好的数组，这个假设很重要
    private void merge(Comparable[] a, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;

        //这里的循环还可以优化，如果一半已经排序完成，那么可以缩短
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    public static void main(String[] args) {
        Integer a[] = {2, 4, 1, 56, 7};
        Sort s = new MergeSort();
        s.sort(a);

        s.display(a);
    }
}