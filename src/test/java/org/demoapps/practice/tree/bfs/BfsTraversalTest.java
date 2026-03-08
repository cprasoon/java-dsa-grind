package org.demoapps.practice.tree.bfs;

import org.demoapps.practice.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BfsTraversalTest {

    BfsTraversal bfsTraversal;

    @BeforeEach
    void setUp() {
        bfsTraversal = new BfsTraversal();
    }

    @Test
    void bfsTraverse() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};

        Assertions.assertArrayEquals(expected, bfsTraversal.bfsTraverse(root));
    }


    @Test
    void dfsTraverseWhenNull() {
        int[] expected = {};
        Assertions.assertArrayEquals(expected, bfsTraversal.bfsTraverse(null));
    }

    @Test
    void dfsTraverseWhenJustOneElement() {
        TreeNode root = new TreeNode(1);
        int[] expected = {1};
        Assertions.assertArrayEquals(expected, bfsTraversal.bfsTraverse(root));
    }
}