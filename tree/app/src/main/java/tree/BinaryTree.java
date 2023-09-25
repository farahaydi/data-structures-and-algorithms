package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BinaryTree {
    FizzBuzzNode root;

    public static class FizzBuzzNode extends Node {
        String value;

        public FizzBuzzNode(String value) {
            super(0);
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public String getValue() {
            return String.valueOf(this.value);
        }
    }

    public BinaryTree() {
        this.root = null;
    }

    public List<String> preOrderTraversal(FizzBuzzNode node) {
        List<String> result = new ArrayList<>();
        if (node != null) {
            result.add(node.getValue());
            result.addAll(preOrderTraversal((FizzBuzzNode) node.left));
            result.addAll(preOrderTraversal((FizzBuzzNode) node.right));
        }
        return result;
    }

    public List<Integer> inOrderTraversal(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node != null) {
            result.addAll(inOrderTraversal(node.left));
            result.add(node.value);
            result.addAll(inOrderTraversal(node.right));
        }
        return result;
    }

    public List<Integer> postOrderTraversal(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node != null) {
            result.addAll(postOrderTraversal(node.left));
            result.addAll(postOrderTraversal(node.right));
            result.add(node.value);
        }
        return result;
    }

    public int findMax() {
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int max = node.value;
        int leftMax = findMaxRecursive(node.left);
        int rightMax = findMaxRecursive(node.right);

        if (leftMax > max) {
            max = leftMax;
        }

        if (rightMax > max) {
            max = rightMax;
        }

        return max;
    }

    public List<Integer> breadthFirst() {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<FizzBuzzNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            FizzBuzzNode node = queue.poll();
            result.add(Integer.parseInt(node.value));

            if (node.left != null) {
                queue.offer((FizzBuzzNode) node.left);
            }

            if (node.right != null) {
                queue.offer((FizzBuzzNode) node.right);
            }
        }

        return result;
    }
}