package com.hikvision.rensu.algorithms.sort;


public class SelectSort extends AbstractSort {
    public static void main(String[] args) {
        Integer a[] = {2, 4, 1, 56, 7, 78, 8, 96, 55, 432};
        Sort s = new SelectSort();
        s.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    @Override
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }


    public void sort2(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length && less(a[j], a[min]); j++) {
                min = j;
            }
            exch(a, i, min);
        }
    }
}
