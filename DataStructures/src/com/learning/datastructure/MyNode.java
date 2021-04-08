package com.learning.datastructure;

public class MyNode<K> implements InNode<K> {
    private InNode next;
    private K key;

    public MyNode(K key) {
        this.next = null;
        this.key = key;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public InNode getNext() {
        return next;
    }

    @Override
    public void setNext(InNode next) {
        this.next = next;
    }
}
