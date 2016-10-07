package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ValidWordAbbreviation {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        while (i < word.length() && j < abbr.length()) {
            if (word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }
            // use > '0' because we are not allowed to start with 0 ('01')
            // however, we are OK to have trailing zeros ('10')
            if (abbr.charAt(j) > '0' && abbr.charAt(j) <= '9') {
                int curPos = j;
                while (j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') j++;
                int num = Integer.valueOf(abbr.substring(curPos, j));
                i += num;
            } else return false;
        }
        return i == word.length() && j == abbr.length();
    }
}
