package org.demoapps.algo.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BinaryTreeTest {

    BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();
        binaryTree.insert(4);
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(6);
        binaryTree.insert(5);
        binaryTree.insert(7);
    }

    @Test
    void insert() {

        Assertions.assertNotNull(binaryTree.root);
        Assertions.assertEquals(7, binaryTree.size);
        Assertions.assertEquals(4, binaryTree.root.data);

        Assertions.assertNotNull(binaryTree.root.left);
        Assertions.assertEquals(2, binaryTree.root.left.data);

        Assertions.assertNotNull(binaryTree.root.right);
        Assertions.assertEquals(6, binaryTree.root.right.data);

        Assertions.assertNotNull(binaryTree.root.left.left);
        Assertions.assertEquals(1, binaryTree.root.left.left.data);

        Assertions.assertNotNull(binaryTree.root.left.right);
        Assertions.assertEquals(3, binaryTree.root.left.right.data);

        Assertions.assertNotNull(binaryTree.root.right.left);
        Assertions.assertEquals(5, binaryTree.root.right.left.data);

        Assertions.assertNotNull(binaryTree.root.right.right);
        Assertions.assertEquals(7, binaryTree.root.right.right.data);
    }

    @Test
    void inOrderTest() {
        ArrayList<Integer> list = binaryTree.inOrder();
        Assertions.assertNotNull(list);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        Assertions.assertEquals(expected, list);
    }

    @Test
    void inOrderLoopTest() {
        ArrayList<Integer> list = binaryTree.inOrderLoop();
        Assertions.assertNotNull(list);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        Assertions.assertEquals(expected, list);
    }


    @Test
    void preOrderTest() {
        ArrayList<Integer> list = binaryTree.preOrder();
        Assertions.assertNotNull(list);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(5);
        expected.add(7);
        Assertions.assertEquals(expected, list);
    }

    @Test
    void preOrderLoopTest() {
        ArrayList<Integer> list = binaryTree.preOrderLoop();
        Assertions.assertNotNull(list);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(5);
        expected.add(7);
        Assertions.assertEquals(expected, list);
    }


    @Test
    void postOrderTest() {
        ArrayList<Integer> list = binaryTree.postOrder();
        Assertions.assertNotNull(list);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(2);
        expected.add(5);
        expected.add(7);
        expected.add(6);
        expected.add(4);
        Assertions.assertEquals(expected, list);
    }


    @Test
    void postOrderLoopTest() {
        List<Integer> list = binaryTree.postOrderLoop();
        Assertions.assertNotNull(list);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(2);
        expected.add(5);
        expected.add(7);
        expected.add(6);
        expected.add(4);
        Assertions.assertEquals(expected, list);
    }

    @Test
    void bfsTravelTest() {
        ArrayList<Integer> list = binaryTree.bfsTravel();
        Assertions.assertNotNull(list);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        expected.add(6);
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        Assertions.assertEquals(expected, list);
    }
}