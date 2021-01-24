package questions.Array;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int solve(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);

        int currentElement = nums[0];
        int length = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentElement + 1) {
                count++;
                currentElement = nums[i];
                if (count > length){
                    length = count;
                }
            } else if (currentElement == nums[i]) {
                continue;
            } else {
                currentElement = nums[i];
                count = 1;
            }
        }
        return length;
    }
    public int solve2(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int length = 1;
        for (int val: set) {
            if (set.contains(val - 1)) {
//                 can't be our starting point of our sequence
                continue;
            } else {
                // one of the possible starting point of our sequence
                int count = 1, current = val;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                    if (count > length) length = count;
                }
            }
        }
        return length;
    }
}
