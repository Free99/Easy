package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class NthDigit {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        // find the length of the number, which our nth digit falls into
        while (n > len * count) {
            n -= len * count; // number left
            len++;
            count *= 10;
            start *= 10;
        }

        // find the actual number of our nth digit
        start += (n - 1) / len;

        // find nth digit
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}
