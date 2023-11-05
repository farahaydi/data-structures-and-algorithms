package treeintersection;
import java.util.Set;
public class App {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(150);
        root1.left = new TreeNode(100);
        root1.right = new TreeNode(250);
        root1.left.left = new TreeNode(75);
        root1.left.right=new TreeNode(160);
        root1.left.right.left=new TreeNode(125);
        root1.left.right.right=new TreeNode(175);
        root1.right.left = new TreeNode(200);
        root1.right.right = new TreeNode(350);
        root1.right.right.left = new TreeNode(300);
        root1.right.right.right = new TreeNode(500);

        TreeNode root2 = new TreeNode(42);
        root2.left = new TreeNode(100);
        root2.right = new TreeNode(600);
        root2.left.left = new TreeNode(15);
        root2.left.right = new TreeNode(160);
        root2.left.right.left = new TreeNode(125);
        root2.left.right.right = new TreeNode(175);


        root2.right.left = new TreeNode(200);
        root2.right.right = new TreeNode(350);
        root2.right.right.left = new TreeNode(4);
        root2.right.right.right = new TreeNode(500);


        Set<Integer> intersection = TreeIntersection.tree_intersection(root1, root2);
        System.out.println("Intersection: " + intersection);
    }
}
