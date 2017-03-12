package by.bogdan.leetcode.auxiliary;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains static methods for various conversions
 */
public class Convertors {
    public static List toList(TreeNode node) {
        return toList(node, null);
    }

    public static List toList(TreeNode node, List<Integer> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (node != null) {
            list.add(node.val);
            toList(node.left, list);
            toList(node.right, list);
        }
        return list;
    }
}
