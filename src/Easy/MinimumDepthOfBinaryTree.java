package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.right != null) return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        return 1 + minDepth(root.left) + minDepth(root.right); // there must exist a null node for left or right;
    }
}
