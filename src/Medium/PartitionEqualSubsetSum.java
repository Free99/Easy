package Medium;

/**
 * Created by Tianshan on 10/13/16.
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) return true;
        int volume = 0;
        for (int num : nums) {
            volume += num;
        }
        // if the total sum is not even, we can't have a partition of 2 valid subsets
        if (volume % 2 != 0) return false;
        volume /= 2; // the volume of each backpack
        boolean[] dp = new boolean[volume + 1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = volume; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[volume];
    }
}
