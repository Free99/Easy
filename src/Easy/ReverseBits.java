package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += n & 1;
            n >>>= 1;
            if (i < 31) res <<= 1;
        }
        return res;
    }
}
