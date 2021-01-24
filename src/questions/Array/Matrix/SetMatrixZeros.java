package questions.Array.Matrix;

public class SetMatrixZeros {
    public int[][] solve(int[][] matrix) {
        boolean column = true;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) column = false;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 1; j--) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }

            if (!column) matrix[i][0] = 0;
        }
        return matrix;
    }
}
