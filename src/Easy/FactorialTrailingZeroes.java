package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
