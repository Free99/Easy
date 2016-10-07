package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (isBadVersion(m)) r = m;
            else l = m + 1;
        }
        return l;
    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    private boolean isBadVersion(int m) {
        return true;
    }
}
