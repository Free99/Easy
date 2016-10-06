package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int pos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) nums[pos++] = nums[i];
        }
        return pos;
    }
}
