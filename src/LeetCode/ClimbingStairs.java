package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int one_step_before = 1, two_step_before = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = one_step_before + two_step_before;
            two_step_before = one_step_before;
            one_step_before = res;
        }
        return res;
    }
}
