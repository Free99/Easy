package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // It's important to check the case x % 10 == 0
        // since it could cause infinite loop in our while loop
        if ((x < 0) || (x != 0 && x % 10 == 0)) return false;
        int sum = 0;
        while (x < sum) {
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        return (x == sum) || (x == sum / 10);
    }
}
