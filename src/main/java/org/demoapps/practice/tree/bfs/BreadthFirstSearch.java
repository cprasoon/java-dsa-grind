package org.demoapps.practice.tree.bfs;

import org.demoapps.practice.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public boolean search(TreeNode root, int target) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.val == target) {
                return true;
            }
            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }
        return false;
    }
}
