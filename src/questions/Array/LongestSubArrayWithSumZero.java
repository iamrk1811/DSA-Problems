package questions.Array;

import java.util.HashMap;

public class LongestSubArrayWithSumZero {
    public int solve(int[] arr) {
        int max = 0, currentSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (map.containsKey(currentSum)) {
                max = Math.max(max, i - map.get(currentSum));
            } else {
                map.put(currentSum, i);
            }
        }
        return max;
    }
}
