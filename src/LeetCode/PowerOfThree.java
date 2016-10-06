package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class PowerOfThree {
    int maxPow3 = (int) Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3)));

    public boolean isPowerOfThree(int n) {
        return (n > 0) && (maxPow3 % n == 0);
    }
}
