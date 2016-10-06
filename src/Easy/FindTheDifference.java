package Easy;

/**
 * Created by Tianshan on 10/3/16.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int n = t.length() - 1;
        char c = t.charAt(n);
        for (int i = 0; i < n; i++) {
            c ^= s.charAt(i);
            c ^= s.charAt(i);
        }
        return c;
    }
}
