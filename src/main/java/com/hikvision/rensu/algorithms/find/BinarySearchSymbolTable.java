package com.hikvision.rensu.algorithms.find;

public class BinarySearchSymbolTable<Key extends Comparable, Value> implements SymbolTable<Key, Value> {

    private Key[] keys;
    private Value[] values;
    private int N;

    public BinarySearchSymbolTable(int capacity) {
        keys = (Key[]) new Comparable[capacity];
        values = (Value[]) new Object[capacity];
    }

    private int rank(Key k, int lo, int hi) {
        if (hi < lo) return lo;
        int mid = lo + (hi - lo) / 2;
        int cmp = k.compareTo(keys[mid]);
        if (cmp < 0) return rank(k, lo, mid - 1);
        else if (cmp > 0) return rank(k, mid + 1, hi);
        else return mid;
    }

    @Override
    public void put(Key key, Value value) {

    }

    @Override
    public Value get(Key key) {
        return null;
    }

    @Override
    public void delete(Key key) {

    }

    @Override
    public boolean contains(Key key) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterable<Key> keys() {
        return null;
    }
}
