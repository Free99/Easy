package Medium;

import Easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tianshan on 10/17/16.
 */
public class FindLeavesOfBinaryTree {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        helper(root, res);
        return res;
    }

    private int helper(TreeNode root, List<List<Integer>> res) {
        if (root == null) return -1;
        int level = 1 + Math.max(helper(root.left, res), helper(root.right, res));
        if (level >= res.size()) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        return level;
    }
}
