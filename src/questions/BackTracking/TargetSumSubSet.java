package questions.BackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TargetSumSubSet {
    public List<List<Integer>> solve(int[] arr, int target) {
        List<List<Integer>> res = resolve(arr, 0, 0, new ArrayList<Integer>(), target);
        return res;
    }
    private List<List<Integer>> resolve(int[] arr, int index, int currentSum, ArrayList<Integer> set, int target) {

        if (index == arr.length) {
            List<List<Integer>> res = new ArrayList<>();
            if (currentSum == target) {
                res.add(set);
                return res;
            }
            return res;
        }

        List<List<Integer>> res = new ArrayList<>();

        ArrayList<Integer> temp1 = new ArrayList<>(set);
        temp1.add(arr[index]);

        List<List<Integer>> recRes1 = resolve(arr, index + 1, currentSum + arr[index], temp1, target );

        List<List<Integer>> recRes2 = resolve(arr, index + 1, currentSum, set, target);

        res.addAll(recRes1);
        res.addAll(recRes2);

        return res;
    }
}
