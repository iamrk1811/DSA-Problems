package questions.DynamicProgramming;

public class CountNumberOfSubsetWithGivenDifference {
    public int solve(int[] arr, int diff) {
        long sumArray = 0;
        for (int val : arr) sumArray += val;
        int count = 0;
        int sum1 = (int) (diff + sumArray) / 2;

        count = countSubsetTargetSum(arr, sum1);
        return count;
    }
    private int countSubsetTargetSum(int[] arr, int target) {
        int[][] dp = new int[arr.length + 1][target + 1];
        for (int i = 0; i < dp.length; i++) dp[i][0] = 1;
        for (int j = 1; j < dp[0].length; j++) dp[0][j] = 0;


        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[arr.length][target];
    }
}
