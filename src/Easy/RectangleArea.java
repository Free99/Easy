package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.min(A, E);
        int right = Math.max(left, Math.min(C, G));
        int bot = Math.max(B, F);
        int top = Math.max(bot, Math.min(D, H));
        return (C - A) * (D - B) + (G - E) * (H - F) - (right - left) * (top - bot);
    }
}
