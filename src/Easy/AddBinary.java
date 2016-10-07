package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0) return b;
        if (b == null || b.length() == 0) return a;
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int aBit, bBit;
        int carry = 0;
        int tmp;
        while (i >= 0 || j >= 0 || carry == 1) {
            aBit = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0;
            bBit = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;
            tmp = aBit ^ bBit ^ carry;
            carry = (aBit + bBit + carry) > 1 ? 1 : 0;
            res.append(tmp);
        }
        return res.reverse().toString();
    }
}
