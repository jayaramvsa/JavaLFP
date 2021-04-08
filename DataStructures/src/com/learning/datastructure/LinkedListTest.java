package com.learning.datastructure;

import com.sun.xml.internal.ws.policy.AssertionSet;
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

}
