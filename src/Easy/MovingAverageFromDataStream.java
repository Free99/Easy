package Easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Tianshan on 10/1/16.
 */
public class MovingAverageFromDataStream {
    private int size;
    private double sum;
    private Queue<Integer> q;

    /** Initialize your data structure here. */
    public MovingAverageFromDataStream(int size) {
        this.size = size;
        sum = 0;
        q = new LinkedList<>();
    }

    public double next(int val) {
        if (q.size() == size) {
            sum -= q.poll();
        }
        sum += val;
        q.offer(val);
        return sum / q.size();
    }
}


/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */