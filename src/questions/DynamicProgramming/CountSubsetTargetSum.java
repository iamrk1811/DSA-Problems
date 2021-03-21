package questions.DynamicProgramming;

public class CountSubsetTargetSum {
    public int solve(int[] arr, int target) {
        int[][] t = new int[arr.length + 1][target + 1];
        for (int i = 0; i < t.length; i++) {
            t[i][0] = 1;
        }
        for (int j = 1; j < t[0].length; j++) {
            t[0][j] = 0;
        }

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[arr.length][target];
    }
}
