package questions.Array.Matrix;

public class Max1sInRow {
    public int solve(int[][] matrix) {
        int maxColumn = matrix[0].length - 1;
        int minRow = 0;
        int maxRow = matrix.length;

        int row = -1, max = 0;
        while (maxColumn >= 0 && minRow < maxRow) {
            if (matrix[minRow][maxColumn] == 1) {
                if ((matrix[minRow].length - maxColumn) > max) {
                    max = matrix[minRow].length - maxColumn;
                    row = minRow;
                }
                maxColumn--;
            }
            else minRow++;
        }
        return row;
    }
}
