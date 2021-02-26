import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void test() {
        int[] array = {1, 2, 3, 6, 3, 6, 1};
        int n = array.length;
        for (int i = 0; i < array.length; i++) {

        }
    }

}

class Solution {
    public Integer countSmaller(int[] nums) {
        int[] res = mergeCounting(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(res));
        return 0;
    }

    private int[] mergeCounting(int[] nums, int start, int end) {
        int[] res = new int[nums.length];
        Integer count = new Integer(0);
        if (start < end) {
            int mid = (start + end) / 2;
            mergeCounting(nums, start, mid);
            mergeCounting(nums, mid + 1, end);
            mergeTwoSortedArray(nums, start, mid, end, res);
        }
        return res;
    }
    private Integer mergeTwoSortedArray(int[] nums, int start, int mid, int end, int[] res) {
        int[] arr1 = new int[mid - start + 1];
        int[] arr2 = new int[end - mid];

        for (int i = 0; i < arr1.length; i++)
            arr1[i] = nums[start + i];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = nums[mid + i + 1];

        int i = 0, j = 0, k = start;
        int count = 0;
        for (; i < arr1.length && j < arr2.length; k++) {
            if (arr1[i] > arr2[j]) {
                nums[k] = arr2[j];
                res[k] += arr1.length - i;
                count += arr1.length - i;
                System.out.println(arr1[i] + " " + arr2[j]);
                j++;
            } else {
                nums[k] = arr1[i];
                i++;
            }
        }
        while (i < arr1.length) {
            nums[k] = arr1[i];
            i++; k++;
        }

        while (j < arr2.length) {
            nums[k] = arr2[j];
            j++; k++;
        }
        return count;
    }
}