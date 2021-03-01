package questions.Array;

import java.util.Arrays;

public class KthRowOfPascalTriangle {
    public int[] solve(int row) {
//        Kth row using extra space of O(rowNumber)
//        base cases
        if (row == 1) return new int[]{1};
        if (row == 2) return new int[]{1, 1};

        int[] res = new int[row];
        Arrays.fill(res, 1);
        for (int i = 1; i < res.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                res[j] += res[j - 1];
            }
        }
        return res;
    }
}
