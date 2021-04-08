package com.learning.datastructure;

public interface InNode<K>{

    K getKey();
    void setKey(K key);

    InNode getNext();
    void setNext(InNode next);
}
