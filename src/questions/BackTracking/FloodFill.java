package questions.BackTracking;

public class FloodFill {
    public void floodFill(int[][] matrix, int row, int col, String ans, boolean[][] visited) {
        if (row < 0 || row == matrix.length || col < 0 || col == matrix[0].length || matrix[row][col] == 1 || visited[row][col]) {
            return;
        } else if (row == matrix.length - 1 && col == matrix[0].length - 1) {
            System.out.println(ans);
            return;
        }

//        TOP - LEFT - DOWN - RIGHT
        visited[row][col] = true;
        floodFill(matrix, row - 1, col, ans + "T", visited);
        floodFill(matrix, row, col - 1, ans + "L", visited);
        floodFill(matrix, row + 1, col, ans + "D", visited);
        floodFill(matrix, row, col + 1, ans + "R", visited);
        visited[row][col] = false;
    }
}
