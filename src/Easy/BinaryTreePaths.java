package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tianshan on 10/6/16.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        helper(res, root, "");
        return res;
    }

    private void helper(List<String> res, TreeNode root, String path) {
        if (root.left == null && root.right == null) res.add(path + root.val);
        if (root.left != null) helper(res, root.left, path + root.val + "->");
        if (root.right != null) helper(res, root.right, path + root.val + "->");
    }
}
