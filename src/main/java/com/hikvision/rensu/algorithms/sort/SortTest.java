package com.hikvision.rensu.algorithms.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {

        //InsertSortTest();

        //SelectSortTest();
    }

    @Test
    public void InsertSortTest() {
        Integer a[] = {2, 4, 1, 56, 7, 78, 8, 96, 55, 432};
        Sort s = new InsertSort();
        s.sort(a);

        Assert.assertTrue(s.isSorted(a));
        s.display(a);
    }

    @Test
    public void SelectSortTest() {
        Integer a[] = {2, 4, 1, 56, 7, 78, 8, 96, 55, 432};
        Sort s = new SelectSort();
        s.sort(a);

        Assert.assertTrue(s.isSorted(a));
        s.display(a);
    }

    @Test
    public  void MergeSortTest(){
        Integer a[] = {2, 4, 1, 56, 7};
        Sort s = new MergeSort();
        s.sort(a);

        //Assert.assertTrue(s.isSorted(a));
        s.display(a);

    }
}
