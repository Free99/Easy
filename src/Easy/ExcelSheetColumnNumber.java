package Easy;

/**
 * Created by Tianshan on 10/5/16.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        return s.length() == 0 ? 0 : titleToNumber(s.substring(0, s.length() - 1)) * 26 + s.charAt(s.length() - 1) - 'A' + 1;
    }
}
