package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] nums = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                if (nums[secret.charAt(i) - '0']++ < 0) cows++; // we have guessed
                if (nums[guess.charAt(i) - '0']-- > 0) cows++; // there exists such character
            }
        }
        return bulls + "A" + cows + "B";
    }
}
