package com.learning.datastructure;

public class MyLinkedList {

    public InNode head;
    public InNode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * <p> Simple Method to Create LinkedList using Add in a sequence mentioned</p>
     * @param myNewNode
     */
    public void add(InNode myNewNode) {
        if (this.head == null) {
            this.head = myNewNode;

        } else {
           this.tail.setNext(myNewNode);
        }
        this.tail = myNewNode;
    }

    public void printNode(){
        StringBuffer sMyNodes = new StringBuffer("My Nodes:");
        InNode currentNode = head;
        while(currentNode.getNext() != null){
            sMyNodes.append(currentNode.getKey());
            if(!currentNode.equals(tail)) sMyNodes.append("->");
            currentNode = currentNode.getNext();
        }
        sMyNodes.append(currentNode.getKey());
        System.out.println(sMyNodes);
    }

    /**
     * <p>Method for adding node in Reverse </p>
     * @param myNewNode
     */
    public void addInReverse(InNode myNewNode) {
        if(this.tail == null) this.tail = myNewNode;
        if(this.head == null) this.head = myNewNode;
        else {
            InNode currentNode = this.head;
            this.head = myNewNode;
            this.head.setNext(currentNode);
        }
    }

    /**
     * <p>Method for creating LinkedList suing Append Mode</p>
     * @param myNewNode
     */
    public void append(InNode myNewNode) {
        if(this.head == null) this.head = myNewNode;
        if(this.tail != null) this.tail.setNext(myNewNode);
        this.tail = myNewNode;
    }
}
