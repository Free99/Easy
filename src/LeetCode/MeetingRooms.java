package LeetCode;

import java.util.Arrays;

/**
 * Created by Tianshan on 10/5/16.
 */
public class MeetingRooms {
    public boolean canAttendMeeting(Interval[] intervals) {
        Arrays.sort(intervals, (x, y) -> (x.start - y.start));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) return false;
        }
        return true;
    }
}
