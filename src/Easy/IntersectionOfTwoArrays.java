package Easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Tianshan on 10/5/16.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums1) set.add(num);
        for (int num : nums2) if (set.contains(num)) intersection.add(num);
        int[] res = new int[intersection.size()];
        int i = 0;
        Iterator<Integer> iter = intersection.iterator();
        while (iter.hasNext()) {
            res[i++] = iter.next();
        }
        return res;
    }
}
