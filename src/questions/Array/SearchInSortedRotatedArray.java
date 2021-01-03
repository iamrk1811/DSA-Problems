package questions.Array;

public class SearchInSortedRotatedArray {
    public int solve(int[] arr, int n, int target) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (arr[low] < arr[mid]) {
//                left side increasing order
                if (target <= arr[mid] && target >= arr[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
//                right side increasing order
                if (target <= arr[high] && target >= arr[mid]) {
                    low = mid + 1;
                } else {
                   high = mid - 1;
                }
            }
        }

        return -1;
    }
}
