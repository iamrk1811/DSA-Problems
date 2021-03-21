package questions.DynamicProgramming;

import java.util.Arrays;

public class CoinChangeMinimum {
    public int solve(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int j = 0; j < coins.length; j++){
            for(int i = 0; i <= amount; i++){
                if(i - coins[j] >= 0) dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public int solve2(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0, j = 0; j < dp[0].length; j++)
            dp[i][j] = Integer.MAX_VALUE - 1;
        for (int i = 1, j = 0; i < dp.length; i++)
            dp[i][j] = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i - 1][j], (dp[i][j - coins[i - 1]] + 1));
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[coins.length][amount];
    }
}
