package Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tianshan on 10/5/16.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.add(c)) {
                set.remove(c);
                count += 2;
            }
        }

        return count + (set.size() > 0 ? 1 : 0);
    }
}
