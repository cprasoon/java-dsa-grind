package org.demoapps.practice.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {


    ReverseLinkedList reverseLinkedList;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void reverseLinkedList() {
        SimpleLinkedList linkedList = new SimpleLinkedList();
        linkedList.insertFirst(100);
        linkedList.insertFirst(499);
        linkedList.insertFirst(990);
        linkedList.insertFirst(750);
        linkedList.insertFirst(830);
        linkedList.insertFirst(230);
        linkedList.insertFirst(470);

        List<Integer> currentList = linkedList.toList();
        System.out.println("Before:" + currentList);
        reverseLinkedList.reverseLinkedList(linkedList);
        List<Integer> reveresedList = linkedList.toList();
        System.out.println("After:" + reveresedList);
        Assertions.assertEquals(reveresedList.reversed(), currentList);
    }

    @Test
    void reverseLinkedSize1List() {
        SimpleLinkedList linkedList = new SimpleLinkedList();
        linkedList.insertFirst(870);

        List<Integer> currentList = linkedList.toList();
        System.out.println("Before:" + currentList);
        reverseLinkedList.reverseLinkedList(linkedList);
        List<Integer> reveresedList = linkedList.toList();
        System.out.println("After:" + reveresedList);
        Assertions.assertEquals(reveresedList.reversed(), currentList);
    }

    @Test
    void reverseLinkedSize2List() {
        SimpleLinkedList linkedList = new SimpleLinkedList();
        linkedList.insertFirst(870);
        linkedList.insertFirst(970);

        List<Integer> currentList = linkedList.toList();
        System.out.println("Before:" + currentList);
        reverseLinkedList.reverseLinkedList(linkedList);
        List<Integer> reveresedList = linkedList.toList();
        System.out.println("After:" + reveresedList);
        Assertions.assertEquals(reveresedList.reversed(), currentList);
    }

    @Test
    void reverseLinkedNullList() {
        SimpleLinkedList linkedList = new SimpleLinkedList();

        List<Integer> currentList = linkedList.toList();
        System.out.println("Before:" + currentList);
        reverseLinkedList.reverseLinkedList(linkedList);
        List<Integer> reveresedList = linkedList.toList();
        System.out.println("After:" + reveresedList);
        Assertions.assertEquals(reveresedList.reversed(), currentList);
    }
}