package com.learning.datastructure;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {

        this.myLinkedList = new MyLinkedList();
    }
    public void push(InNode myNewNode) {
        myLinkedList.addInReverse(myNewNode);
    }

    public void printStack() {
        myLinkedList.printNode();
    }

    public InNode peak() {
        return myLinkedList.head;
    }

    public InNode pop() {
        return myLinkedList.pop();
    }

    public void queue(InNode myNewNode) {
        myLinkedList.append(myNewNode);
    }
}
