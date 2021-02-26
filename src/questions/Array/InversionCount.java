package questions.Array;

import java.util.Arrays;

public class InversionCount {
    //    we have to find how far is the array to being sorted
    public int solve(int[] nums) {
        int res = mergeSort(nums, 0, nums.length - 1);
//        System.out.println(Arrays.toString(nums));
        return res;
    }

    private int mergeSort(int[] nums, int start, int end) {
        int count = 0;
        if (start < end) {
            int mid = (start + end) / 2;
            count += mergeSort(nums, start, mid);
            count += mergeSort(nums, mid + 1, end);
            count += mergeTwoSortedArray(nums, start, mid, end);
        }
        return count;
    }
    private int mergeTwoSortedArray(int[] nums, int start, int mid, int end) {
        int[] arr1, arr2;
        arr1 = new int[mid - start + 1];
        arr2 = new int[end - mid];

        for (int i = 0; i < arr1.length; i++)
            arr1[i] = nums[start + i];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = nums[mid + i + 1];

        int i = 0, j = 0;
        int k = start;
        int count = 0;
        for (; i < arr1.length && j < arr2.length;) {
            if (arr1[i] > arr2[j]) {
                nums[k] = arr2[j];

                count += arr1.length - i;

                j++;
            } else {
                nums[k] = arr1[i];
                i++;
            }
            k++;
        }

        while (i < arr1.length) {
            nums[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            nums[k] = arr2[j];
            j++;
            k++;
        }
        return count;
    }
}
