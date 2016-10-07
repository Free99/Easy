package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String sample = strs[0];
        int prefixLen = sample.length();
        for (int i = 1; i < strs.length; i++) {
            String nextWord = strs[i];
            prefixLen = Math.min(prefixLen, nextWord.length());
            for (int j = 0; j < prefixLen; j++) {
                if (sample.charAt(j) != nextWord.charAt(j)) {
                    prefixLen = j;
                    break;
                }
            }
        }
        return sample.substring(0, prefixLen);
    }
}
