package questions.DynamicProgramming;

public class CoinChangePermutation {
    public int solve(int[] coins, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int amount = 1; amount < dp.length; amount++) {
            for (int coin : coins) {
                if (coin <= amount)
                    dp[amount] += dp[amount - coin];
            }
        }
        return dp[target];
    }
}
