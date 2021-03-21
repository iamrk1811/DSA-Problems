package questions.DynamicProgramming;

public class CoinChangeCombination {
    public int solve(int[] arr, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }
        return dp[target];
    }
    public int solve2(int[] arr, int target) {
        int[][] dp = new int[arr.length + 1][target + 1];
        for (int i = 0, j = 0; i < dp.length; i++) dp[i][j] = 1;
        for (int i = 0, j = 1; j < dp[0].length; j++) dp[i][j] = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[arr.length][target];
    }
}
