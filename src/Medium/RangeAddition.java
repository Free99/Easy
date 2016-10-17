package Medium;

/**
 * Created by Tianshan on 10/17/16.
 */
public class RangeAddition {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        for (int[] update : updates) {
            int start = update[0];
            int end = update[1];
            int value = update[2];
            res[start] += value;
            if (end < length - 1) {
                res[end + 1] -= value; // make sure we have the right updated range
            }
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += res[i];
            res[i] = sum;
        }
        return res;
    }
}
