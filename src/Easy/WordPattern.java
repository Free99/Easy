package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tianshan on 10/6/16.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;
        Map<Object, Integer> index = new HashMap<>();
        for (Integer i = 0; i < words.length; i++) {
            // the previous value associated with key, or null if there was no mapping for key
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) return false;
        }
        return true;
    }
}
