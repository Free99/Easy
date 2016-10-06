package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return false;
        int m1[] = new int[256], m2[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1; // add one to separate from the initilization of 0
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
