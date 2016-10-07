package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = s.length();
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) sb[i] = new StringBuilder();
        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) {
                sb[idx].append(c[i++]);
            }
            for (int idx = numRows - 2; idx > 0 && i < len; idx--) {
                sb[idx].append(c[i++]);
            }
        }
        for (i = 1; i < numRows; i++) sb[0].append(sb[i]);
        return sb[0].toString();
    }
}
