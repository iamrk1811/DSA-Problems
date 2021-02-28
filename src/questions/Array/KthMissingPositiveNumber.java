package questions.Array;

public class KthMissingPositiveNumber {
    public int solve(int[] arr, int k) {
//        leetcode 1539
        int low = 0, high = arr.length - 1;
        int missing = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            missing = compute(arr[mid], mid + 1);
            if (missing < k)
                low = mid + 1;
            else high = mid - 1;
        }

        if (high == -1) return k;

        return arr[high] + k - compute(arr[high], high + 1);
    }
    private int compute(int max, int k) {
        return max - k;
    }
}
