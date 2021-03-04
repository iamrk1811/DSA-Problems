import java.lang.reflect.Array;
import java.util.*;
public class Test {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = getPermutation(nums);
        return res;
    }
    private List<List<Integer>> getPermutation(int[] nums) {
        if (nums.length == 1) {
            List<List<Integer>> res = new ArrayList<>();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(nums[0]);
            res.add(temp);
            return res;
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            int[] finalArray = new int[nums.length - 1];
            int index = 0;

            for (int j = 0; j < i; j++) {
                finalArray[index] = nums[j];
                index++;
            }

            for (int j = i + 1; j < nums.length; j++) {
                finalArray[index] = nums[j];
                index++;
            }

            List<List<Integer>> temp = getPermutation(finalArray);

            for (List<Integer> dummy : temp) {
                dummy.add(val);
            }
            res.addAll(temp);
        }
        return res;
    }
}