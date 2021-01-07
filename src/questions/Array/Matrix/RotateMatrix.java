package questions.Array.Matrix;

public class RotateMatrix {
    public void rotate90AntiClockWise(int[][] matrix) {
//        Transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= temp;
            }
        }
//        Reverse every row
        int low = 0, top = matrix.length  - 1;
        while (low < top) {
            int[] temp = matrix[low];
            matrix[low] = matrix[top];
            matrix[top] = temp;
            low++;
            top--;
        }
        display(matrix);
    }
    public void rotateCloc90kWise(int[][] matrix) {
//        Transpose the matrix
        for (int i = 0; i < matrix.length; i++){
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//        Reverse every column of each row
        for (int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix[0].length - 1;
            while (low < high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
//        Display matrix
        display(matrix);
    }

    private void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
