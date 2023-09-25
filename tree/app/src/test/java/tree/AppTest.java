package tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testEmptyTree() {
        BinaryTree tree = new BinaryTree();
        assertNull(tree.root);
    }

    @Test
    public void testSingleNodeTree() {
        BinaryTree tree = new BinaryTree();
        tree.root = (BinaryTree.FizzBuzzNode) new BinaryTree.Node(5);
        assertEquals(5, tree.root.value);
        assertNull(tree.root.left);
        assertNull(tree.root.right);
    }

    @Test
    public void testPreOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.root = (BinaryTree.FizzBuzzNode) new BinaryTree.Node(1);
        tree.root.left = new BinaryTree.Node(2);
        tree.root.right = new BinaryTree.Node(3);
        tree.root.left.left = new BinaryTree.Node(4);
        tree.root.left.right = new BinaryTree.Node(5);

        List<String> preOrderResult = tree.preOrderTraversal(tree.root);
        assertEquals(List.of(1, 2, 4, 5, 3), preOrderResult);
    }

    @Test
    public void testInOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.root = (BinaryTree.FizzBuzzNode) new BinaryTree.Node(1);
        tree.root.left = new BinaryTree.Node(2);
        tree.root.right = new BinaryTree.Node(3);
        tree.root.left.left = new BinaryTree.Node(4);
        tree.root.left.right = new BinaryTree.Node(5);

        List<Integer> inOrderResult = tree.inOrderTraversal(tree.root);
        assertEquals(List.of(4, 2, 5, 1, 3), inOrderResult);
    }

    @Test
    public void testPostOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.root = (BinaryTree.FizzBuzzNode) new BinaryTree.Node(1);
        tree.root.left = new BinaryTree.Node(2);
        tree.root.right = new BinaryTree.Node(3);
        tree.root.left.left = new BinaryTree.Node(4);
        tree.root.left.right = new BinaryTree.Node(5);

        List<Integer> postOrderResult = tree.postOrderTraversal(tree.root);
        assertEquals(List.of(4, 5, 2, 3, 1), postOrderResult);
    }

    @Test
    public void testFindMaxRecursive() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(1);
        tree.add(4);
        tree.add(15);

        int max = tree.findMax();

        assertEquals(15, max);
    }

    @Test
    public void testBreadthFirst() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(1);
        tree.add(4);
        tree.add(15);

        List<Integer> result = tree.breadthFirst();

        assertEquals(6, result.size());

        assertEquals(Integer.valueOf(5), result.get(0));
        assertEquals(Integer.valueOf(3), result.get(1));
        assertEquals(Integer.valueOf(8), result.get(2));
        assertEquals(Integer.valueOf(1), result.get(3));
        assertEquals(Integer.valueOf(4), result.get(4));
        assertEquals(Integer.valueOf(15), result.get(5));
    }

    @Test
    public void testAdd() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(15);
        bst.add(9);
        bst.add(20);
        bst.add(7);
        assertTrue(bst.contains(15));
        assertTrue(bst.contains(9));
        assertTrue(bst.contains(20));
        assertTrue(bst.contains(7));
        assertFalse(bst.contains(12));
    }

    @Test
    public void testFizzBuzzTree() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(15);
        bst.add(9);
        bst.add(20);
        bst.add(7);

        BinarySearchTree.FizzBuzzNode fizzBuzzRoot = bst.fizzBuzzTree((BinarySearchTree.FizzBuzzNode) bst.root);
        assertEquals("FizzBuzz", fizzBuzzRoot.getValue());
        assertEquals("Fizz", fizzBuzzRoot.left.getValue());
        assertEquals("Buzz", fizzBuzzRoot.right.getValue());
        assertEquals("7", fizzBuzzRoot.left.left.getValue());
    }
}
