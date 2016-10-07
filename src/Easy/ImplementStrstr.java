package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ImplementStrstr {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        if (haystack.length() == 0 || needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                if (j == needle.length() - 1) return i;
            }
        }
        return -1;
    }
}
