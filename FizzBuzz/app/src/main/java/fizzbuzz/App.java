package fizzbuzz;
public class App {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode("3");
        TreeNode node2 = new TreeNode("5");
        TreeNode node3 = new TreeNode("15");
        TreeNode node4 = new TreeNode("7");
        node1.children.add(node2);
        node1.children.add(node3);
        node1.children.add(node4);
        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();
        TreeNode newRoot = fizzBuzzTree.fizzBuzzTree(node1);
        printTree(newRoot);
    }
    private static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        for (TreeNode child : root.children) {
            printTree(child);
        }
    }}