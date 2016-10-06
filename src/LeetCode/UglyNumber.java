package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        for (int i = 2; i < 6 && num > 0; i++) {
            while (num % i == 0) num /= i;
        }
        return num == 1;
    }
}
