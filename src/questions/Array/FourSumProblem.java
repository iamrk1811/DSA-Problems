package questions.Array;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class FourSumProblem {
    public List<List<Integer>> solve(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int total = nums[i] + nums[j] + nums[k];
                    int newTarget = target - total;
                    int result = binarySearch(nums, k + 1, newTarget);
                    if (result >= 0) {
                        String str = String.valueOf(nums[i]) + String.valueOf(nums[j]) + String.valueOf(nums[k]) + String.valueOf(nums[result]);
                        boolean flag = set.add(str);
                        if (flag) {
                            ArrayList<Integer> temp = new ArrayList<Integer>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[result]);
                            list.add(temp);
                        }
                    }
                }
            }
        }

        return list;
    }
    private int binarySearch(int[] nums, int start, int target) {
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }

    public List<List<Integer>> solve2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        int prevI, prevJ;
        prevI = prevJ = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length;) {
            if (prevI != nums[i]) prevI = nums[i];
            else {
                while (i + 1 < nums.length && prevI != nums[i + 1]) {
                    prevI = nums[i + 1];
                    i++;
                }
            }
            int prevLeft, prevRight;
            prevLeft = prevRight = Integer.MAX_VALUE;
            for (int j = i + 1; j < nums.length;) {
                if (prevJ != nums[j]) prevJ = nums[j];
                else {
                    while (j + 1 < nums.length && prevJ != nums[j + 1]) {
                        prevJ = nums[j + 1];
                        j++;
                    }
                }

                int left = j + 1, right = nums.length - 1;

                int total = nums[i] + nums[j];
                while (left < right && left < nums.length) {
                    if (prevLeft != nums[left]) prevLeft = nums[left];
                    if (prevRight != nums[right]) prevRight = nums[right];
                    if (total + nums[left] + nums[right] == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        list.add(temp);


                        while (left + 1 < nums.length && nums[left] != nums[left+1]) {
                            left++;
                            System.out.println("hello");
                        }

                        while (nums[right] != nums[right - 1] && left >= right) {
                            right--;
                            System.out.println("hi");
                        }
                    }
                    if (total + nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
                j++;
            }
            i++;
        }

        return list;
    }
}
