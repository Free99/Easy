package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tail = x % 10;
            int newRes = res * 10 + tail;
            if ((newRes - tail) / 10 != res) return 0;  //overflow
            res = newRes;
            x /= 10;
        }
        return res;
    }
}
