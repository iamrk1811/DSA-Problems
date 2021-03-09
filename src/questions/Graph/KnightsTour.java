package questions.Graph;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KnightsTour {
    public void solve(int n, int row, int col) {
        int[][] chess = new int[n][n];
        tour(chess, row, col, 1);

    }

    private void tour(int[][] chess, int row, int col, int moveNumber) {
        if (row < 0 || col < 0 || row >= chess.length || col >= chess[0].length || chess[row][col] > 0)
            return;
        if (moveNumber == chess.length * chess[0].length) {
            for (int[] arr : chess)
                System.out.println(Arrays.toString(arr));
            System.out.println();
            return;
        }
        chess[row][col] = moveNumber;
        tour(chess, row - 2, col + 1, moveNumber + 1);
        tour(chess, row - 1, col + 2, moveNumber + 1);
        tour(chess, row + 1, col + 2, moveNumber + 1);
        tour(chess, row + 2, col + 1, moveNumber + 1);
        tour(chess, row + 2, col - 1, moveNumber + 1);
        tour(chess, row + 1, col - 2, moveNumber + 1);
        tour(chess, row - 1, col - 2, moveNumber + 1);
        tour(chess, row - 2, col - 1, moveNumber + 1);
        chess[row][col] = 0;
    }
}