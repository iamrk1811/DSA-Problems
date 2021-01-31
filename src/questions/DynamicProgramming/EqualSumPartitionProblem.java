package questions.DynamicProgramming;

public class EqualSumPartitionProblem {
    public boolean solve(int[] arr, int n) {
        long sum = 0;
        for (int val: arr) sum += val;
        if (sum % 2 != 0) return false;

        int target = (int) sum / 2;

        boolean[][] t = new boolean[arr.length + 1][target + 1];

        for (int i = 0, j = 0; i < arr.length + 1; i++) t[i][j] = true;
        for (int i = 0, j = 1; j < target + 1; j++) t[i][j] = false;

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                if (arr[i - 1] <= j)
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[arr.length][target];
    }
}
