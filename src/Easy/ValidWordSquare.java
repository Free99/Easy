package Easy;

import java.util.List;

/**
 * Created by Tianshan on 10/17/16.
 */
public class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
        if (words == null || words.size() == 0) return true;
        int listSize = words.size();
        for (int i = 0; i < listSize; i++) {
            String curWord = words.get(i);
            for (int j = 0; j < curWord.length(); j++) {
                if (j >= listSize || i >= words.get(j).length() || curWord.charAt(j) != words.get(j).charAt(i))
                    return false;
            }
        }
        return true;
    }
}
