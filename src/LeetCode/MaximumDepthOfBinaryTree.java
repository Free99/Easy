package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Tianshan on 10/3/16.
 */

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        int curNum = 0;
        int next = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            next--;
            if (node.left != null) {
                queue.offer(node.left);
                curNum++;
            }

            if (node.right != null) {
                queue.offer(node.right);
                curNum++;
            }

            if (next == 0) {
                next = curNum;
                curNum = 0;
                depth++;
            }
        }

        return depth;
    }

    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth1(root.left), maxDepth1(root.right));
    }
}
