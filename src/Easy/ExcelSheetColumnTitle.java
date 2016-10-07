package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char) ('A' + n % 26);
    }
}
