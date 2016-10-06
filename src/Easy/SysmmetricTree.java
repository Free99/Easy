package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class SysmmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
    }
}
