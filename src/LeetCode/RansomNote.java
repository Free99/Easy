package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tianshan on 10/5/16.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            // it could be unique, so that we use getOrDefault
            int newCount = map.getOrDefault(c, 0) - 1;
            if (newCount < 0) return false;
            map.put(c, newCount);
        }

        return true;
    }
}
