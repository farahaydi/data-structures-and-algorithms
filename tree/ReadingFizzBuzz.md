# Code Challenge: Class 18
The challenge requires creating a new k-ary tree with modified values based on specific rules. If a node's value is divisible by 3, replace it with "Fizz". If it's divisible by 5, replace with "Buzz". If divisible by both 3 and 5, use "FizzBuzz". Otherwise, convert the number to a String. The task involves implementing a Java function called fizzBuzzTree that applies these rules to the nodes of the input tree.

## Whiteboard Process
[whiteboard](./Screenshot%20(495).png)
## Approach & Efficiency
The provided Java code implements a recursive approach for the "FizzBuzz Tree" challenge. The algorithm traverses a k-ary tree and creates a new tree with modified values based on specific rules: replacing values divisible by 3 with "Fizz", values divisible by 5 with "Buzz", and values divisible by both 3 and 5 with "FizzBuzz". If a value doesn't meet these criteria, it's converted to a string. The time and space complexity of this algorithm is O(n), where n is the number of nodes in the input tree.

## Solution
```
public FizzBuzzNode fizzBuzzTree(FizzBuzzNode node) {
            if (node == null) {
                return null;
            }

            FizzBuzzNode newNode = new FizzBuzzNode("");

            if (Integer.parseInt(node.getValue()) % 3 == 0 && Integer.parseInt(node.getValue()) % 5 == 0) {
                newNode.setValue("FizzBuzz");
            } else if (Integer.parseInt(node.getValue()) % 3 == 0) {
                newNode.setValue("Fizz");
            } else if (Integer.parseInt(node.getValue()) % 5 == 0) {
                newNode.setValue("Buzz");
            } else {
                newNode.setValue(node.getValue());
            }

            newNode.left = fizzBuzzTree((FizzBuzzNode) node.left);
            newNode.right = fizzBuzzTree((FizzBuzzNode) node.right);

            return newNode;
        }
```
BinarySearchTree bst = new BinarySearchTree();

        // Add some nodes
        bst.add(15);
        bst.add(9);
        bst.add(20);
        bst.add(7);

        // Call fizzBuzzTree method
        BinarySearchTree.FizzBuzzNode fizzBuzzRoot = bst.fizzBuzzTree((BinarySearchTree.FizzBuzzNode) bst.root);

        // Print the result
        System.out.println("In-order Traversal after FizzBuzz transformation:");
        List<String> result = bst.inOrderTraversal(fizzBuzzRoot);
        System.out.println(result);
    }
In-order Traversal after FizzBuzz transformation:
[Fizz, 7, FizzBuzz, Buzz]
