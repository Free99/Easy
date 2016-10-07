package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class IntegerReplacement {
    public int intergerReplacement(int n) {
        if (n == Integer.MAX_VALUE) return 32;  // n = 2^31 - 1;
        int count = 0;
        while (n != 1) {
            // elimate more trailing zeroes
            // except the special case for 3
            if ((n + 1) % 4 == 0 && (n != 3)) n += 1;
            else n -= 1;
            count++;
        }
        return count;
    }
}
