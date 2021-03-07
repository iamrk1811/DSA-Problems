package questions.BackTracking;

public class NQueens {
    public void placeQueen(int n) {
        int[][] arr = new int[n][n];
        resolve(arr, 0, "");
    }
    private void resolve(int[][] chess, int row, String ans) {
        if (chess.length == row) {
            System.out.println(ans);
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isSafeOurQueen(chess, row, col)) {
                chess[row][col] = 1;
                resolve(chess, row + 1, ans + "row => " + row + " col => " + col + "\n");
                chess[row][col] = 0;
            }
        }
    }
    private boolean isSafeOurQueen(int[][] chess, int r, int c) {
//        check vertically
        for (int row = r, col = c; row < chess.length; row++) {
            if (chess[row][col] == 1) return false;
        }
        for (int row = r, col = c; row >= 0; row--) {
            if (chess[row][col] == 1) return false;
        }
//        check diagonally
//        direction 1 == top left
        for (int row = r, col = c; col >= 0 && row >= 0 ; col--, row--) {
            if (chess[row][col] == 1) return false;
        }
//        direction 2 down left
        for (int row = r, col = c; row < chess.length && col >= 0 ; row++, col--) {
            if (chess[row][col] == 1) return false;
        }
//        direction 3 top right
        for (int row = r, col = c; row >= 0 && col < chess.length ; row--, col++) {
            if (chess[row][col] == 1) return false;
        }
//        direction 4 down right
        for (int row = r, col = c; row < chess.length && col < chess.length; row++, col++) {
            if (chess[row][col] == 1) return false;
        }
        return true;
    }
}
