package com.learning.datastructure;

import java.util.LinkedList;

public class MyLinkedList<K> {

    public InNode head;
    public InNode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * <p> Simple Method to Create LinkedList using Add in a sequence mentioned</p>
     *
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

    public void printNode() {
        StringBuffer sMyNodes = new StringBuffer("My Nodes:");
        InNode currentNode = head;
        while (currentNode.getNext() != null) {
            sMyNodes.append(currentNode.getKey());
            if (!currentNode.equals(tail)) sMyNodes.append("->");
            currentNode = currentNode.getNext();
        }
        sMyNodes.append(currentNode.getKey());
        System.out.println(sMyNodes);
    }

    /**
     * <p>Method for adding node in Reverse </p>
     *
     * @param myNewNode
     */
    public void addInReverse(InNode myNewNode) {
        if (this.tail == null) this.tail = myNewNode;
        if (this.head == null) this.head = myNewNode;
        else {
            InNode currentNode = this.head;
            this.head = myNewNode;
            this.head.setNext(currentNode);
        }
    }

    /**
     * <p>Method for creating LinkedList suing Append Mode</p>
     *
     * @param myNewNode
     */
    public void append(InNode myNewNode) {
        if (this.head == null) this.head = myNewNode;
        if (this.tail != null) this.tail.setNext(myNewNode);
        this.tail = myNewNode;
    }

    /**
     * <p>Method for inserting new Node in between two nodes</p>
     *
     * @param previousNode
     * @param newNode
     */
    public void insertAfter(InNode previousNode, InNode newNode) {
        if (previousNode == null) {
            System.err.println("** Previous node cannot be empty or null");
            return;
        }
        InNode currentNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(currentNode);
    }

    public InNode pop() {
        InNode currentHead = this.head;
        this.head = head.getNext();
        return currentHead;
    }

    public InNode popLast() {
        InNode currentNode = head;
        while (!currentNode.getNext().equals(tail)) {
            currentNode = currentNode.getNext();
        }
        this.tail = currentNode;
        currentNode = currentNode.getNext();
        return currentNode;
    }

    public boolean searchByKey(K key) {
        InNode currentNode = head;
        while (currentNode != null && currentNode.getNext() != null) {
            if (currentNode.getKey().equals(key)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public void findByKeyAndInsert(K key, InNode newNode) {
        InNode currentNode = head;
        while (currentNode != null && currentNode.getNext() != null) {
            if(currentNode.getKey().equals(key)) {
                InNode existingNode = currentNode.getNext();
                currentNode.setNext(newNode);
                newNode.setNext(existingNode);
                break;
            }
            currentNode = currentNode.getNext();
        }
    }
}
