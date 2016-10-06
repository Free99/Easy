package Easy;

/**
 * Created by Tianshan on 10/5/16.
 */
public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        // we need to check the situation when i == j
        for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
            if (!"00 11 696 88".contains(num.charAt(i) + "" + num.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
