package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[pos++] = nums[i];
        }
        return pos;
    }
}
