package org.demoapps.algo.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    TreeNode root;
    int size;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
        size++;
    }

    private TreeNode insertRec(TreeNode start, int data) {
        TreeNode tn = new TreeNode(data);
        if (start != null) {
            if(data <= start.data){
                TreeNode left = insertRec(start.left, data);
                left.parent = start;
                start.left = left;
                tn = start;
            } else if(data > start.data){
                TreeNode right = insertRec(start.right, data);
                right.parent = start;
                start.right = right;
                tn = start;
            }
        }
        return tn;
    }

    public TreeNode find(int data) {
        return findRec(root, data);
    }

    public TreeNode findRec(TreeNode start, int data) {
        TreeNode tn = null;
        if(start != null) {
            if (data == start.data) {
                tn = start;
            } else if (data < start.data) {
                tn = findRec(start.left, data);
            } else if (data > start.data) {
                tn = findRec(start.right, data);
            }
        }
        return tn;
    }

    public ArrayList<Integer> inOrder() {
        ArrayList<Integer> list = new ArrayList<>(size);
        inOrderRec(root, list);
        return list;
    }

    private void inOrderRec(TreeNode root, ArrayList<Integer> list) {
        if (root != null) {
            inOrderRec(root.left, list);
            list.add(root.data);
            inOrderRec(root.right, list);
        }
    }

    public ArrayList<Integer> inOrderLoop() {
        ArrayList<Integer> list = new ArrayList<>(size);
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.data);
            node = node.right;
        }
        return list;
    }


    public ArrayList<Integer> preOrder() {
        ArrayList<Integer> list = new ArrayList<>(size);
        preOrderRec(root, list);
        return list;
    }

    private void preOrderRec(TreeNode root, ArrayList<Integer> list) {
        if (root != null) {
            list.add(root.data);
            preOrderRec(root.left, list);
            preOrderRec(root.right, list);
        }
    }

    public ArrayList<Integer> preOrderLoop() {
        ArrayList<Integer> list = new ArrayList<>(size);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.data);

            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }

    public ArrayList<Integer> postOrder() {
        ArrayList<Integer> list = new ArrayList<>(size);
        postOrderRec(root, list);
        return list;
    }

    private void postOrderRec(TreeNode root, ArrayList<Integer> list) {
        if (root != null) {
            postOrderRec(root.left, list);
            postOrderRec(root.right, list);
            list.add(root.data);
        }
    }

    public List<Integer> postOrderLoop() {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode prev = null;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode peekNode = stack.peek();
                if (peekNode.right != null && prev != peekNode.right) {
                    current = peekNode.right;
                } else {
                    result.add(stack.pop().data);
                    prev = peekNode;
                }
            }
        }
        return result;
    }


    public ArrayList<Integer> bfsTravel(){
        ArrayList<Integer> list = new ArrayList<>(size);
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            TreeNode node = nodes.poll();
            if(node!=null){
                list.add(node.data);
                if(node.left != null){
                    nodes.add(node.left);
                }
                if(node.right != null){
                    nodes.add(node.right);
                }
            }
        }
        return list;
    }


}