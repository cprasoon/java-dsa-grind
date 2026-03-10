package org.demoapps.practice.tree.dfs;

import org.demoapps.practice.tree.TreeNode;

public class DepthFirstSearchRecursive {

    public boolean search(TreeNode root, int target) {
        if(root == null) return false;
        if(root.val == target) return true;
        return search(root.left, target) || search(root.right, target);
    }

}
