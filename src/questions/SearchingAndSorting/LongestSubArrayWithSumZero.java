package questions.SearchingAndSorting;

import java.util.HashMap;

public class LongestSubArrayWithSumZero {
    public int solve(int[] arr) {
        int max = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) max = Math.max(max, i + 1);

            if (map.containsKey(sum)) max = Math.max(max, i - map.get(sum));
            else map.put(sum, i);
        }

        return max;
    }
}
