package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (guess(mid) == 0) return mid;
            else if (guess(mid) == 1) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
