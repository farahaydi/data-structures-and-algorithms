# Max Tree
# Challenge Title
The findMax method in a binary tree data structure retrieves and returns the highest numeric value stored within the tree. It utilizes a recursive algorithm to traverse the tree and track the maximum value encountered. The method ensures that the highest value is accurately identified.

## Whiteboard Process
[whiteboard](./Screenshot%20(481).png)

## Approach & Efficiency
Approach:

Recursive Traversal: The method recursively explores the tree by visiting each node and comparing its value to the maximum value found so far. This is a natural choice for tree traversal tasks.

Tracking Maximum Value: The algorithm keeps track of the maximum value seen during traversal. Whenever a new maximum is found, it updates the max variable.

Space Complexity:

The space complexity of this approach is O(h), where "h" is the height of the binary tree. This is because the recursive calls create a call stack, and the space used is proportional to the height of the tree.
Time Complexity:

The time complexity is O(n), where "n" is the number of nodes in the binary tree. In the worst case, the algorithm may have to visit every node to find the maximum value.

## Solution

```
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
```
// Create a BinarySearchTree
BinarySearchTree tree = new BinarySearchTree();

        // Add some nodes
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        // Call findMax
        int max = tree.findMax();
        System.out.println("Maximum value in the tree: " + max);
After running the program, you should see an output like:
Maximum value in the tree: 80