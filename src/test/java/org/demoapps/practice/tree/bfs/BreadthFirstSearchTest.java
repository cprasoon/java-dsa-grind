package org.demoapps.practice.tree.bfs;

import org.demoapps.practice.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BreadthFirstSearchTest {

    BreadthFirstSearch bfs;

    @BeforeEach
    void setUp() {
        bfs = new BreadthFirstSearch();
    }

    @Test
    void search() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Assertions.assertTrue(bfs.search(root, 7));
    }


    @Test
    void searchSingeNodeTree() {
        TreeNode root = new TreeNode(1);
        Assertions.assertFalse(bfs.search(root, 7));
    }


    @Test
    void searchWhenNull() {
        Assertions.assertFalse(bfs.search(null, 7));
    }
}