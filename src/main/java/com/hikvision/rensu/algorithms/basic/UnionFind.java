package com.hikvision.rensu.algorithms.basic;

public interface UnionFind {
    boolean connected(int p, int q);

    int find(int p);

    void union(int p, int q);

    int count();
}
