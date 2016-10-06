package Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tianshan on 10/5/16.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}
