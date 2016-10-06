package Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tianshan on 10/2/16.
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        return set.size() < 2;
    }
}
