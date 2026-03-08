package org.demoapps.practice.tree.dfs;

import org.demoapps.practice.tree.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class DfsTraversal {

    public int[] dfsTraverse(TreeNode root) {
        if (root == null) return new int[0];

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
