package questions.DynamicProgramming;

public class MinimumCostInMazeTraversal {
    public int solve(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];


        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = arr[0].length - 1; j >= 0; j--){
                if(i == arr.length - 1 && j == arr[0].length - 1){
                    dp[i][j] = arr[i][j];
                } else if(i == arr.length - 1){
                    dp[i][j] = arr[i][j] + dp[i][j + 1];
                } else if(j == arr[0].length - 1){
                    dp[i][j] = arr[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = arr[i][j] + Math.min(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][0];
    }
}
