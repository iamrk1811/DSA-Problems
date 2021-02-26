package questions.Array;

import java.util.HashSet;

public class FindAllPairsWithGivenSum {
    public int solve(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(target - arr[i])) {
                count++;
            } else {
                set.add(arr[i]);
            }
            if (target - arr[i] == arr[i]) count--;
        }
        return count;
    }
}
