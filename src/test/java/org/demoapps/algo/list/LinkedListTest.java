package org.demoapps.algo.list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @BeforeEach
    public void setUp() throws Exception {
    }
    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        System.out.println(list.toString());
        Assertions.assertNotNull(list);
    }

    @Test
    public void testAddAtEnd() {
        LinkedList list = new LinkedList();
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(3);
        System.out.println(list.toString());
        Assertions.assertNotNull(list);
    }


    @Test
    public void testSize() {
        LinkedList list = new LinkedList();
        Assertions.assertEquals(0, list.size());
        list.addNode(1);
        Assertions.assertEquals(1, list.size());
        list.addNode(2);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testContains() {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        Assertions.assertTrue(list.contains(1));
        Assertions.assertTrue(list.contains(2));
        Assertions.assertFalse(list.contains(3));
    }

    @Test
    public void testGet() {
        LinkedList list = new LinkedList();
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(3);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
    }

    @Test
    public void testInsertAt() {
        LinkedList list = new LinkedList();
        list.insertAt(0, 1); // [1]
        Assertions.assertEquals(1, list.get(0));
        list.insertAt(1, 3); // [1, 3]
        Assertions.assertEquals(3, list.get(1));
        list.insertAt(1, 2); // [1, 2, 3]
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
        Assertions.assertEquals(3, list.size());
        
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.insertAt(5, 5));
    }

    @Test
    public void testDeleteAt() {
        LinkedList list = new LinkedList();
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(3);
        
        list.deleteAt(1); // [1, 3]
        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(3, list.get(1));
        
        list.deleteAt(0); // [3]
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(3, list.get(0));
        
        list.deleteAt(0); // []
        Assertions.assertEquals(0, list.size());
        
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.deleteAt(0));
    }

    @Test
    public void testReverse() {
        LinkedList list = new LinkedList();
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(3);
        
        list.reverse(); // [3, 2, 1]
        Assertions.assertEquals(3, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(1, list.get(2));
        
         // Test reverse on empty list
        LinkedList emptyList = new LinkedList();
        emptyList.reverse();
        Assertions.assertEquals(0, emptyList.size());

        // Test reverse on single element list
        LinkedList singleList = new LinkedList();
        singleList.addNode(1);
        singleList.reverse();
        Assertions.assertEquals(1, singleList.get(0));
    }
}
