package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int maj = nums[0], count = 1;
        for (int i = 1; i < nums.length && count <= nums.length / 2; i++) {
            if (count == 0) {
                maj = nums[i];
                count = 1;
            } else {
                count += maj == nums[i] ? 1 : -1;
            }
        }
        return maj;
    }
}
