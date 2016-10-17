package Medium;

/**
 * Created by Tianshan on 10/17/16.
 */
public class WiggleSort {
    public void wiggleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                if (nums[i - 1] > nums[i]) swap(nums, i);
            } else if (i != 0 && nums[i] > nums[i - 1]) {
                swap(nums, i);
            }
        }
    }

    private void swap(int[] nums, int i) {
        int tmp = nums[i];
        nums[i] = nums[i - 1];
        nums[i - 1] = tmp;
    }
}
