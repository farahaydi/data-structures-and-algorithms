# Challenge Title
Create a binary tree and a binary search tree in Java, with proper traversal methods and testing, while following principles of clean code.

## Whiteboard Process
[tree](./Screenshot%20(475).png)

## Approach & Efficiency
Binary Tree:

Insertion: O(1) (random), O(n) (worst case, unbalanced).
Traversal: O(n) for all types (pre-order, in-order, post-order).
Searching: O(n) in the worst case.
Binary Search Tree (BST):

Insertion: O(log n) (average, balanced), O(n) (worst case, unbalanced).
Traversal: O(n) for all types.
Searching: O(log n) (average, balanced), O(n) (worst case, unbalanced).

## Solution
```
public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
public class BinaryTree {
    Node root;

    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree() {
        this.root = null;
    }

    public List<Integer> preOrderTraversal(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node != null) {
            result.add(node.value);
            result.addAll(preOrderTraversal(node.left));
            result.addAll(preOrderTraversal(node.right));
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
    public class BinarySearchTree extends BinaryTree{
        public BinarySearchTree() {
            super();
        }

        public void add(int value) {
            root = addRecursive(root, value);
        }

        private Node addRecursive(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }

            if (value < current.value) {
                current.left = addRecursive(current.left, value);
            } else if (value > current.value) {
                current.right = addRecursive(current.right, value);
            }

            return current;
        }
        public boolean contains(int value) {
            return containsRecursive(root, value);
        }

        private boolean containsRecursive(Node current, int value) {
            if (current == null) {
                return false;
            }

            if (value == current.value) {
                return true;
            }

            return value < current.value
                    ? containsRecursive(current.left, value)
                    : containsRecursive(current.right, value);
        }
```

BinarySearchTree tree = new BinarySearchTree();

        // Adding nodes
        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(1);
        tree.add(4);

        // Checking if values exist
        System.out.println("Contains 4: " + tree.contains(4)); // Should print true
        System.out.println("Contains 6: " + tree.contains(6)); // Should print false