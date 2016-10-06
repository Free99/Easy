package Easy;

/**
 * Created by Tianshan on 10/5/16.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) & ((n & (n - 1)) == 0);
    }
}
