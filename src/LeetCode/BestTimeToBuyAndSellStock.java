package LeetCode;

/**
 * Created by Tianshan on 10/5/16.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        // Corner case for length == 1
        if (prices.length == 1) return 0;
        int maxEndingHere = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxEndingHere += Math.max(0, maxEndingHere += prices[i] - prices[i - 1]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}
