package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            ones += n & 1;
            n >>>= 1;
        }
        return ones;
    }
}
