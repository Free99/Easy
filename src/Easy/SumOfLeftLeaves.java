package Easy;

/**
 * Created by Tianshan on 10/5/16.
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        int res = 0;
        if (root.left != null) {
            // this is a left leaf
            if (root.left.left == null && root.left.right == null) res += root.left.val;
            else res += sumOfLeftLeaves(root.left);
        }
        if (root.right != null) {
            res += sumOfLeftLeaves(root.right);
        }
        return res;
    }
}
