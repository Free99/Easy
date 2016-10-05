package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[pos++] = nums[i];
        }
        while (pos < nums.length) nums[pos++] = 0;
    }
}
