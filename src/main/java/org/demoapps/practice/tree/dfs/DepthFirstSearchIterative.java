package org.demoapps.practice.tree.dfs;

import org.demoapps.practice.tree.TreeNode;

import java.util.Stack;

public class DepthFirstSearchIterative {

    public boolean search(TreeNode root, int target) {

        if(root == null) return false;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.val == target){
                return true;
            }
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        return false;
    }
}
