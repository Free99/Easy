package Easy;

/**
 * Created by Tianshan on 10/5/16.
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] map = new int[256];
        for (int i = 0; i < s.length(); i++) map[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == 1) return i;
        return -1;
    }
}
