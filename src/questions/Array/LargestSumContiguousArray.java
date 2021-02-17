package questions.Array;

public class LargestSumContiguousArray {
    public static int largestSum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentSum + arr[i] >= arr[i]) {
                currentSum += arr[i];
            } else {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
