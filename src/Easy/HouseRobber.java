package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int prevMax = 0;
        int curMax = 0;
        for (int num : nums) {
            int temp = curMax;
            curMax = Math.max(prevMax + num, curMax);
            prevMax = temp;
        }
        return curMax;
    }
}
