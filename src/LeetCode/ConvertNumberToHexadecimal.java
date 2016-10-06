package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class ConvertNumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int digit = num & 0xf; // get last four digits
            sb.append(digit < 10 ? (char) (digit + '0') : (char) (digit - 10 + 'a'));
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
