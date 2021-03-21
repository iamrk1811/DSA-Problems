package questions.DynamicProgramming;

public class RodCutting {
    public int solve(int[] arr, int n) {
        int[][] dp = new int[arr.length + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        int[] len = new int[n];
        for (int i = 0; i < n; i++) len[i] = i + 1;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (len[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], arr[i - 1] + dp[i][j - len[i - 1]]);
                } else {

                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[arr.length][n];
    }
}
