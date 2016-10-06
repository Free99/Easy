package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class LowestCommonAncestorOfBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return (root.val - p.val) * (root.val - q.val) <= 0 ? root : lowestCommonAncestor(root.val < p.val ? root.right : root.left, p, q);
    }
}
