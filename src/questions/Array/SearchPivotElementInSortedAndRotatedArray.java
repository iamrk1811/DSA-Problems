package questions.Array;

public class SearchPivotElementInSortedAndRotatedArray {
    public int solve (int[] arr, int n) {
        int low = 0, high = n -1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
