package Easy;

/**
 * Created by Tianshan on 10/10/16.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.length() == 0) return num2;
        if (num2 == null || num2.length() == 0) return num1;
        int pos1 = num1.length() - 1, pos2 = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (pos1 >= 0 || pos2 >= 0 || carry != 0) {
            int tmp = (pos1 < 0 ? 0 : Character.getNumericValue(num1.charAt(pos1--))) + (pos2 < 0 ? 0 : Character.getNumericValue(num2.charAt(pos2--))) + carry;
            carry = tmp / 10;
            sb.append(tmp % 10);
        }
        return sb.reverse().toString();
    }
}
