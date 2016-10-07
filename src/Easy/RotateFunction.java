package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class RotateFunction {
    // F(0) = 0 * A(0) + 1 * A(1) + ... + (n - 1) * A(n - 1)
    // F(1) = 0 * A(n - 1) + 1 * A(0) + ... + (n - 1) * A(n - 2)
    // ...
    // F(k) = 0 * A(n - k) + 1 * A(n - k + 1) + ... (n - 1) * A(n - (k + 1))
    // F(k + 1) = 0 *A(n - (k + 1)) + 1 * A(n - k) + ... (n - 1) * A(n - (k + 2))
    // F(k + 1) - F(k) = sum - n * A(n - k - 1);

    public int maxRotateFunction(int[] A) {
        int sum = 0;
        int len = A.length;
        int F = 0;
        for (int i = 0; i < len; i++) {
            F += i * A[i];
            sum += A[i];
        }

        int max = F;
        for (int i = len - 1; i >= 1; i--) {
            F = F + sum - len * A[i];
            max = Math.max(F, max);
        }

        return max;
    }
}
