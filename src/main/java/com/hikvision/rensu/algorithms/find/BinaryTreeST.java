package com.hikvision.rensu.algorithms.find;

public class BinaryTreeST<Key extends Comparable, Value> implements SymbolTable<Key, Value> {

    Node root;

    boolean recursion = true;

    @Override
    public void put(Key key, Value value) {
        if (recursion) {
            root = putRecursion(root, key, value);
        } else {
            putWithOutRecursioin(key, value);
        }
    }

    private Node putRecursion(Node x, Key k, Value v) {
        if (x == null) return new Node(k, v, null, null);
        int cmp = k.compareTo(x.key);
        if (cmp > 0) x.right = putRecursion(x.right, k, v);
        else if (cmp < 0) x.left = putRecursion(x.left, k, v);
        else x.value = v;
        return x;
    }


    private void putWithOutRecursioin(Key key, Value value) {
        if (root == null) {
            Node nd = new Node(key, value, null, null);
        } else {
            Node nd = root;
            while (true) {
                if (nd.key.compareTo(key) < 0) {
                    if (nd.left == null) {
                        nd.left = new Node(key, value, null, null);
                        break;
                    } else {
                        nd = nd.left;
                    }
                } else if (nd.key.compareTo(key) > 0) {
                    if (nd.right == null) {
                        nd.right = new Node(key, value, null, null);
                        break;
                    } else {
                        nd = nd.right;
                    }
                } else {
                    nd.value = value;
                }
            }
        }
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
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterable<Key> keys() {
        return null;
    }

    private class Node {
        Key key;
        Value value;
        Node left;
        Node right;

        Node(Key k, Value v, Node l, Node r) {
            this.key = k;
            this.value = v;
            this.left = l;
            this.right = r;
        }
    }
}
