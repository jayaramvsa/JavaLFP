package com.learning.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void createLinkedList() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(76);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.printNode();
        myLinkedList.add(secondNode);
        myLinkedList.printNode();
        myLinkedList.add(thirdNode);
        myLinkedList.printNode();
        boolean bResult = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assertions.assertTrue(true);

    }

    @Test
    public void createLinkedListInReverse() {
        MyNode<Integer> firstNode = new MyNode<>(76);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(50);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addInReverse(firstNode);
        myLinkedList.printNode();
        myLinkedList.addInReverse(secondNode);
        myLinkedList.printNode();
        myLinkedList.addInReverse(thirdNode);
        myLinkedList.printNode();
        boolean bResult = myLinkedList.head.equals(thirdNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assertions.assertTrue(true);
    }

    @Test
    public void createLinkedListUsingAppend(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(76);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.printNode();
        myLinkedList.append(secondNode);
        myLinkedList.printNode();
        myLinkedList.append(thirdNode);
        myLinkedList.printNode();
        boolean bResult = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assertions.assertTrue(true);
    }

    @Test
    public void insertNodeBetweenTwoNode(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> thirdNode = new MyNode<>(76);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.printNode();
        myLinkedList.append(thirdNode);
        myLinkedList.printNode();
        myLinkedList.insertAfter(firstNode,secondNode);
        myLinkedList.printNode();
        boolean bResult = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assertions.assertTrue(true);
    }

}
