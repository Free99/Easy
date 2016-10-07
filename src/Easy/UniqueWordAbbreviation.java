package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tianshan on 10/7/16.
 */
public class UniqueWordAbbreviation {
    Map<String, String> map;

    public UniqueWordAbbreviation(String[] dictionary) {
        map = new HashMap<>();
        for (String dict : dictionary) {
            String key = getKey(dict);
            if (map.containsKey(key) && !map.get(key).equals(dict)) {
                map.put(key, "");
            } else {
                map.put(key, dict);
            }
        }
    }

    public boolean isUnique(String word) {
        String key = getKey(word);
        return !map.containsKey(word) || map.get(key).equals(word);
    }

    // remember the edge case for those length <= 2
    private String getKey(String str) {
        if (str.length() <= 2) return str;
        return str.charAt(0) + Integer.toString(str.length() - 2) + str.charAt(str.length() - 1);
    }
}

// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new UniqueWordAbbreviation(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");