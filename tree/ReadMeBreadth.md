# Code Challenge: Class 17
The breadthFirst method efficiently traverses a binary tree in a breadth-first manner, visiting nodes level by level. It employs a queue to process nodes, ensuring values are returned in the order they were encountered. This method is useful for exploring hierarchical data structures.

## Whiteboard Process
[whiteboard18](./Screenshot%20(482).png)
## Approach & Efficiency
I've implemented a breadth-first traversal using a queue to process nodes level by level. This approach ensures that nodes are visited in the order they were encountered, which is characteristic of breadth-first traversal.

The time complexity of this approach is O(n), where n is the number of nodes in the tree, as we visit each node once. The space complexity is also O(n) in the worst case, as we may need to store all nodes in the queue at once in scenarios where the tree is perfectly balanced.

## Solution
```
public List<Integer> breadthFirst() {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            result.add(node.value);

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return result;
    }
```
// Create a binary tree and add nodes
BinaryTree tree = new BinaryTree();
tree.root = new BinaryTree.Node(5);
tree.root.left = new BinaryTree.Node(3);
tree.root.right = new BinaryTree.Node(8);
tree.root.left.left = new BinaryTree.Node(1);
tree.root.left.right = new BinaryTree.Node(4);
tree.root.right.right = new BinaryTree.Node(15);

        // Perform breadth-first traversal
        List<Integer> result = tree.breadthFirst();

        // Print the result
        System.out.println(result);
The output should be:
[5, 3, 8, 1, 4, 15]