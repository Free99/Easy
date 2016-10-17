package Medium;

/**
 * Created by Tianshan on 10/17/16.
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) return 0;
        int i = 0, j = 0;
        int[] map = new int[26];
        int maxCnt = 0, maxLen = 0;
        while (i < s.length()) {
            if (map[s.charAt(i) - 'A']++ >= maxCnt) maxCnt = map[s.charAt(i) - 'A'];
            while (i - j + 1 - maxCnt > k) { // if we have more than k unique characters
                // delete previous max characters
                if (map[s.charAt(j++) - 'A']-- == maxCnt) {
                    maxCnt--;
                    for (int l = 0; l < 26; l++) {
                        if (map[l] > maxCnt) maxCnt = map[l]; // update maxCnt;
                    }
                }
            }
            maxLen = Math.max(maxLen, i - j + 1);
            i++;
        }
        return maxLen;
    }
}
