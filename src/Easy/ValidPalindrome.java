package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s == null) return true;
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            char cHead = s.charAt(head);
            char cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) == Character.toLowerCase(cTail)) {
                    head++;
                    tail--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
