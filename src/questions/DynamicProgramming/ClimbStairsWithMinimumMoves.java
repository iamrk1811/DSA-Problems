package questions.DynamicProgramming;

public class ClimbStairsWithMinimumMoves {
    public int solve(int[] arr, int n) {
        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null)
                        min = Math.min(dp[i + j], min);
                }
                if (Integer.MAX_VALUE != min)
                    dp[i] = min + 1;
            }
        }
        return dp[0];
    }
}
