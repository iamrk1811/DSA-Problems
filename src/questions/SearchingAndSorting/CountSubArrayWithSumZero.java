package questions.SearchingAndSorting;

import java.util.HashMap;

public class CountSubArrayWithSumZero {
    public int solve(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = -1, sum = 0, counter = 0;

        map.put(sum, 1);

        while (i < arr.length - 1) {
            i++;

            sum += arr[i];

            if (map.containsKey(sum)) {
                counter += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else map.put(sum, 1);
        }
        return counter;
    }
}
