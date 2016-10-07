package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        int res = 0;
        // trim first
        while (len >= 0 && s.charAt(len) == ' ') len--;
        while (len >= 0 && s.charAt(len) != ' ') {
            len--;
            res++;
        }
        return res;
    }
}
