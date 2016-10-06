package Easy;

/**
 * Created by Tianshan on 10/1/16.
 */
public class ReverseString {
    public String reverseString(String s){
        // basic edge case handling
        if (s == null || s.length() == 0) return "";

        // better change it to char array
        char[] word = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char c = word[i];
            word[i++] = word[j];
            word[j--] = c;
        }

        return String.valueOf(word);
    }
}
