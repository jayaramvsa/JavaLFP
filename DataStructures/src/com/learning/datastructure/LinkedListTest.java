package com.learning.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

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
        Assertions.assertTrue(bResult);

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
                myLinkedList.tail.equals(firstNode);
        Assertions.assertTrue(bResult);
    }

    @Test
    public void createLinkedListUsingAppend() {
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
        Assertions.assertTrue(bResult);
    }

    @Test
    public void insertNodeBetweenTwoNode() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> thirdNode = new MyNode<>(76);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.printNode();
        myLinkedList.append(thirdNode);
        myLinkedList.printNode();
        myLinkedList.insertAfter(firstNode, secondNode);
        myLinkedList.printNode();
        boolean bResult = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assertions.assertTrue(bResult);
    }

    @Test
    public void toDeleteFirstHeadUsingPop() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(76);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        //Removing the Head using Pop
        myLinkedList.printNode();
        myLinkedList.pop();
        myLinkedList.printNode();
        boolean bResult = myLinkedList.head.equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assertions.assertTrue(bResult);
    }

    @Test
    public void toDeleteTailHeadUsingPopLast() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(76);
        MyNode<Integer> fourthNode = new MyNode<>(99);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.add(fourthNode);
        //Removing the Head using Pop
        myLinkedList.printNode();
        myLinkedList.popLast();
        myLinkedList.printNode();
        boolean bResult = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assertions.assertTrue(bResult);
    }

    @Test
    public void toSearchNodeWithKey() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(76);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        //Removing the Head using Pop
        boolean bResult = myLinkedList.searchByKey(30);
        Assertions.assertTrue(bResult);
        boolean bResultFalse = myLinkedList.searchByKey(100);
        Assertions.assertFalse(bResultFalse);
    }

    @Test
    public void toSearchAndInsertWithKey() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(76);
        MyNode<Integer> fourthNode = new MyNode<>(99);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.add(fourthNode);
        MyNode<Integer> newNode = new MyNode<>(40);
        //Insert New Node after a Key
        myLinkedList.printNode();
        myLinkedList.findByKeyAndInsert(30, newNode);
        myLinkedList.printNode();
        Boolean bResult = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.head.getNext().getNext().equals(newNode) &&
                myLinkedList.tail.equals(fourthNode);
        Assertions.assertTrue(bResult);
        boolean bResultFalse = myLinkedList.searchByKey(100);
        Assertions.assertFalse(bResultFalse);
    }
}
