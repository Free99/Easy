import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tianshan on 10/7/16.
 */
public class TwoSum3 {
    private Map<Integer, Integer> map;

    public TwoSum3() {
        map = new HashMap<>();
    }

    // Add the number to an internal data structure.
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public boolean find(int value) {
        for (int key : map.keySet()) {
            int num = value - key;
            if ((num == key && map.get(key) > 1) || (num != key && map.containsKey(num))) return true;
        }
        return false;
    }
}

// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);