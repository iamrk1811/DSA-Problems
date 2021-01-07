package questions.Array;

public class MedianOfTwoSortedArray {
    public double solve1(int[] nums1, int[] nums2) {
//    This problem is solved by Insertion sort method without taking extra space
        if (nums1.length == 0 && nums2.length != 0) {
            int mid = nums2.length / 2;
            double result = 0;
            if (nums2.length % 2 == 0) {
                int firstValue = nums2[mid];
                result = (double) firstValue;
                if (mid - 1 != -1) {
                    int secondValue = nums2[mid - 1];
                    result += secondValue;
                    result /= 2;
                }
            } else {
                int firstValue = nums2[mid];
                result = (double) firstValue;
            }
            return result;
        } else if (nums2.length == 0 && nums1.length != 0) {
            int mid = nums1.length / 2;
            double result = 0;
            if (nums1.length % 2 == 0) {
                int firstValue = nums1[mid];
                result = (double) firstValue;
                if (mid - 1 != -1) {
                    int secondValue = nums1[mid - 1];
                    result += secondValue;
                    result /= 2;
                }
            } else {
                int firstValue = nums1[mid];
                result = (double) firstValue;
            }
            return result;
        }

        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }


        int firstIndex = 0;

        while (firstIndex < nums1.length) {
            if (nums1[firstIndex] > nums2[0]) {
                swap(nums1, nums2, firstIndex, 0);
            }
            firstIndex++;

            int j = 0;
            while (j + 1 < nums2.length && nums2[j] > nums2[j+1]) {
                swap(nums2, nums2, j, j+1);
                j++;
            }
        }

        double result = 0;
        if ((nums1.length + nums2.length) % 2 == 0) {
            int mid = (nums1.length + nums2.length) / 2;

            int firstValue = 0;
            int secondValue = 0;
            if (mid >= nums1.length) {
                if (mid - nums1.length - 1 == -1) {
                    firstValue = nums1[nums1.length - 1];
                    secondValue = nums2[0];
                } else {
                    firstValue = nums2[mid - nums1.length - 1];
                    secondValue = nums2[mid - nums1.length];
                }
            } else {
                firstValue = nums1[mid - 2];
                secondValue = nums1[mid - 1];
            }
            result = (double) (firstValue + secondValue) / 2;
        } else {
            int mid = (nums1.length + nums2.length) / 2;

            if (mid >= nums1.length) {
                result = (double) nums2[mid - nums1.length];
            } else {
                result = (double) nums1[mid];
            }
        }

        return result;
    }

    public void swap(int[] arr1, int[] arr2, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
    public double solve2(int[] nums1, int[] nums2) {
        return 0.0;
    }
}
