package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] map = new int[26]; // only lowercase alphabets
        for (int i = 0; i < s.length(); i++) map[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) if (--map[t.charAt(i) - 'a'] < 0) return false;
        return true;
    }
}
