package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tianshan on 10/5/16.
 */
public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> resList = new ArrayList<>();
        // two pointers
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] == nums2[j]) {
                resList.add(nums1[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }
        int[] res = new int[resList.size()];
        int i = 0;
        for (int num : resList) {
            res[i++] = num;
        }
        return res;
    }
}
