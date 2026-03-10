package org.demoapps.practice.tree.dfs;

import org.demoapps.practice.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchRecursiveTest {

    DepthFirstSearchRecursive dfs;

    @BeforeEach
    void setUp() {
        dfs = new DepthFirstSearchRecursive();
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

        Assertions.assertTrue(dfs.search(root, 7));
        Assertions.assertTrue(dfs.search(root, 6));
        Assertions.assertTrue(dfs.search(root, 5));
        Assertions.assertTrue(dfs.search(root, 4));
        Assertions.assertTrue(dfs.search(root, 3));
        Assertions.assertTrue(dfs.search(root, 2));
        Assertions.assertTrue(dfs.search(root, 1));

        Assertions.assertFalse(dfs.search(root, 0));
        Assertions.assertFalse(dfs.search(root, -100));
        Assertions.assertFalse(dfs.search(root, -2000));
        Assertions.assertFalse(dfs.search(root, 1000));
        Assertions.assertFalse(dfs.search(root, 12323232));
    }


    @Test
    void searchSingeNodeTree() {
        TreeNode root = new TreeNode(1);
        Assertions.assertFalse(dfs.search(root, 7));
        Assertions.assertTrue(dfs.search(root, 1));
    }


    @Test
    void searchWhenNull() {
        Assertions.assertFalse(dfs.search(null, 7));
    }

}