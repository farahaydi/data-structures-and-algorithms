package treeintersection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TreeIntersection {
    public static Set<Integer> tree_intersection(TreeNode root1, TreeNode root2) {
        Set<Integer> result = new HashSet<>();
        Map<Integer, Boolean> map = new HashMap<>();

        populateMap(root1, map);
        checkIntersection(root2, map, result);

        return result;
    }

    private static void populateMap(TreeNode node, Map<Integer, Boolean> map) {
        if (node != null) {
            map.put(node.val, true);
            populateMap(node.left, map);
            populateMap(node.right, map);
        }
    }

    private static void checkIntersection(TreeNode node, Map<Integer, Boolean> map, Set<Integer> result) {
        if (node != null) {
            if (map.containsKey(node.val)) {
                result.add(node.val);
            }
            checkIntersection(node.left, map, result);
            checkIntersection(node.right, map, result);
        }
    }
}
