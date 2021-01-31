package questions.DynamicProgramming;

public class ZeroOneKnapSackProblem {
    public int solution1(int[] value, int[] weight, int n, int W, int[][] qb) {
        if (n == 0 || W == 0) return 0;

//        DP
        if (qb[n][W] > 0) return qb[n][W];

        if (weight[n - 1] <= W) {
//            add
            int profitWithAdding = value[n - 1] + solution1(value, weight, n - 1, W - weight[n -1], qb);
//            don't add
            int profitWithoutAdding = solution1(value, weight, n - 1, W, qb);

            return qb[n][W] = Math.max(profitWithAdding, profitWithoutAdding);

        } else {
            return qb[n][W] = solution1(value, weight, n - 1, W, qb);
        }
    }

    public int solution2(int[] value, int[] weight, int n, int W) {
        int[][] qb = new int[n + 1][W + 1];

        for (int i = 0, j = 0; j < W + 1; j++) qb[i][j] = 0;

        for (int i = 0, j = 0; i < n + 1; i++) qb[i][j] = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (weight[i - 1] <= j) {
                    int profitWithAdding = value[i - 1] + qb[i - 1][j - weight[i - 1]];
                    int profitWithoutAdding = qb[i - 1][j];
                    qb[i][j] = Math.max(profitWithAdding, profitWithoutAdding);
                }
                else
                    qb[i][j] = qb[i - 1][j];
            }
        }

        return qb[n][W];
    }
}
