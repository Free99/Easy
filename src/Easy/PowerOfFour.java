package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        // 1. It's greater than 0
        // 2. It's a power of two
        // 3. The 1 digit will appears only in the odd positions
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
