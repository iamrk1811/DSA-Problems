package questions.DynamicProgramming;

public class ClimbStairsWithVariableJumps {
    public int solve(int[] arr, int n) {
        int[] qb = new int[n + 1];
        qb[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= arr[i] && i + j < qb.length; j++) {
                qb[i] += qb[i + j];
            }
        }
        return qb[0];
    }
}
