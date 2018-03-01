package com.hikvision.rensu.algorithms.find;


/**
 * Symbol Table
 * for find
 * each key just has one value
 * new one replace the old one
 * no null k-value
 *
 * @param <Key>
 * @param <Value>
 */
public interface SymbolTable<Key extends Comparable, Value> {

    void put(Key key, Value value);

    Value get(Key key);

    void delete(Key key);

    boolean contains(Key key);

    boolean isEmpty();

    int size();

    Iterable<Key> keys();
}
