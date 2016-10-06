package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return digits;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) { // so that we don't need carry here
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
