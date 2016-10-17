package Medium;

/**
 * Created by Tianshan on 10/17/16.
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        int pow = 1;
        // follow the pattern, like [8-15] have all the ones in [4-7], but with 1 more in the front
        for (int i = 1, t = 0; i <= num; i++, t++) {
            if (i == pow) {
                pow *= 2;
                t = 0;
            }
            res[i] = res[t] + 1;
        }
        return res;
    }

    public int[] countBits2(int num) {
        int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++) res[i] = res[i >> 1] + (i & 1); // no need to increase if it is even
        return res;
    }
}
