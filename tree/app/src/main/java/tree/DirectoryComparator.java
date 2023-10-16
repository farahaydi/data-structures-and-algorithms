package tree;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    String name;
    List<TreeNode> children;

    TreeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    void addChild(TreeNode child) {
        children.add(child);
    }
}

public class DirectoryComparator {
    public static TreeNode buildTree(File directory) {
        if (directory.isFile()) {
            return new TreeNode(directory.getName());
        }

        TreeNode node = new TreeNode(directory.getName());
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                node.addChild(buildTree(file));
            }
        }

        return node;
    }

    public static boolean compareTrees(TreeNode tree1, TreeNode tree2) {
        if (tree1.children.size() != tree2.children.size()) {
            return false;
        }

        for (int i = 0; i < tree1.children.size(); i++) {
            if (!compareTrees(tree1.children.get(i), tree2.children.get(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        File dir1 = new File("tree/app/src/main/java/tree/Dir1");
        File dir2 = new File("tree/app/src/main/java/tree/Dir2");

        TreeNode tree1 = buildTree(dir1);
        TreeNode tree2 = buildTree(dir2);

        boolean result = compareTrees(tree1, tree2);

        if (result) {
            System.out.println("Both directories have the same structure.");
        } else {
            System.out.println("The directories have different structures.");
        }
    }
}