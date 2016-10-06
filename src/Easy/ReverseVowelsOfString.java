package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class ReverseVowelsOfString {
    static final String vowels = "aeiouAEIOU";

    public String reverseVowels(String s) {
        int l = 0, r = s.length() - 1;
        char[] array = s.toCharArray();
        while (l < r) {
            while (l < r && vowels.indexOf(array[l]) == -1) {
                l++;
            }
            while (l < r && vowels.indexOf(array[r]) == -1) {
                r--;
            }
            char tmp = array[l];
            array[l] = array[r];
            array[r] = tmp;
        }
        return String.valueOf(array);
    }
}
