package questions.DynamicProgramming;

import java.util.ArrayList;

public class MinimumSubsetDifference {
    public int solve(int[] arr) {
        long range = 0;
        for (int val : arr) range += val;

        boolean[] subset = subsetTargetSum(arr, range);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= range / 2; i++) {
            if (subset[i])
                min = Math.min(min, (int)range - (2 * i));
        }
        return min;
    }
    private boolean[] subsetTargetSum(int[] arr, long target) {
        boolean[][] dp = new boolean[arr.length + 1][(int)target + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[arr.length];
    }
}
