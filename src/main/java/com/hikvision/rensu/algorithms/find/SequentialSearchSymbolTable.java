package com.hikvision.rensu.algorithms.find;

public class SequentialSearchSymbolTable<Key extends Comparable, Value> implements SymbolTable<Key, Value> {

    private Node first;

    @Override
    public void put(Key key, Value value) {

        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.value = value;
                return;
            } else {
                first = new Node(key, value, first);
            }
        }
    }

    @Override
    public Value get(Key k) {
        for (Node n = first; n != null; n = n.next) {
            if (k.equals(n.key)) {
                return n.value;
            }
        }
        return null;
    }

    @Override
    public void delete(Key k) {
        for (Node n = first; n != null; n = n.next) {
            if (k.equals(n.key)) {
                n = n.next;
            }
        }
    }

    @Override
    public boolean contains(Key k) {
        for (Node n = first; n != null; n = n.next) {
            if (k.equals(n.key)) return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        int i = 0;
        for (Node n = first; n != null; n = n.next) i++;
        return i;
    }

    @Override
    public Iterable keys() {
        return null;
    }

    private class Node {
        Key key;
        Value value;
        Node next;

        public Node(Key k, Value v, Node n) {
            this.key = k;
            this.value = v;
            this.next = n;
        }
    }
}
