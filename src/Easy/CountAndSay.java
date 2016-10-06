package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        String res = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder curRes = new StringBuilder();
            int count = 1;
            for (int j = 1; j < res.length(); j++) {
                if (res.charAt(j) == res.charAt(j - 1)) {
                    count++;
                } else {
                    curRes.append(count);
                    curRes.append(res.charAt(j - 1));
                    count = 1;
                }
            }
            curRes.append(count);
            curRes.append(res.charAt(res.length() - 1));
            res = curRes.toString();
        }
        return res;
    }
}
