package com.hikvision.rensu.algorithms.basic;


public class UnionFindLow implements UnionFind{
    private int[] id;
    private int count;

    public UnionFindLow(int n) {
        count = n;
        id = new int[count];
        for (int i = 0; i < count; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int n) {
        return id[n];
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);


        if (pId == qId) {
            // find the connected pair
            return;
        } else {
            // make the pair and all orther to a new union.
            for (int i = 0; i < id.length; i++) {
                if (id[i] == qId) {
                    id[i] = pId;
                }
            }
            count--;
        }
    }
}
