package questions.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindTripletSum {
//    written this code for only distinct element
    public int solve(int[] arr, int target) {
//        sorting and two pointer
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1, k = arr.length - 1;
            int newTarget = target - arr[i];
            while (j < k) {
                if (arr[j] + arr[k] == newTarget) {
                    count++;
                    j++; k--;
                } else if (arr[j] + arr[k] < newTarget) j++;
                else k--;
            }
        }

        return count;
    }
    public int solve2(int[] arr, int target) {
//        using hashing
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int newTarget = target - arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int tempTarget = newTarget - arr[j];
                if (map.containsKey(tempTarget) && map.get(tempTarget) != j && map.get(tempTarget) != i) count++;
                map.put(arr[j], j);
            }
        }
        return count;
    }
}
