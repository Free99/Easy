package Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(i - k - 1);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
