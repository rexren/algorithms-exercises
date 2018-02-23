package com.hikvision.rensu.algorithms.sort;

public class SelectSort {

    public static void sort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = a[i];
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    int tmp = min;
                    a[i] = min = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 1, 56, 7, 78, 8, 96, 55, 432};

        sort(a);


        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
