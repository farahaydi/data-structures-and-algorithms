# Code Challenge: Class 18
The challenge requires creating a new k-ary tree with modified values based on specific rules. If a node's value is divisible by 3, replace it with "Fizz". If it's divisible by 5, replace with "Buzz". If divisible by both 3 and 5, use "FizzBuzz". Otherwise, convert the number to a String. The task involves implementing a Java function called fizzBuzzTree that applies these rules to the nodes of the input tree.

## Whiteboard Process
[whiteboard](./Screenshot%20(492).png)
## Approach & Efficiency
The provided Java code implements a recursive approach for the "FizzBuzz Tree" challenge. The algorithm traverses a k-ary tree and creates a new tree with modified values based on specific rules: replacing values divisible by 3 with "Fizz", values divisible by 5 with "Buzz", and values divisible by both 3 and 5 with "FizzBuzz". If a value doesn't meet these criteria, it's converted to a string. The time and space complexity of this algorithm is O(n), where n is the number of nodes in the input tree.

## Solution
```
public TreeNode fizzBuzzTree(TreeNode root) {
        if (root == null) return null;

        TreeNode newRoot = new TreeNode(transformValue(root.val));

        for (TreeNode child : root.children) {
            newRoot.children.add(fizzBuzzTree(child));
        }

        return newRoot;
    }

    private String transformValue(String val) {
        int num = Integer.parseInt(val);

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
```
// Example Usage
TreeNode node1 = new TreeNode("3");
TreeNode node2 = new TreeNode("5");
TreeNode node3 = new TreeNode("15");
TreeNode node4 = new TreeNode("7");

        node1.children.add(node2);
        node1.children.add(node3);
        node1.children.add(node4);

        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();
        TreeNode newRoot = fizzBuzzTree.fizzBuzzTree(node1);

        // Printing the new tree
        fizzBuzzTree.printTree(newRoot);
