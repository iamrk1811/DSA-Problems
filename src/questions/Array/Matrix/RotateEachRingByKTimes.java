package questions.Array.Matrix;

public class RotateEachRingByKTimes {
    public void solve (int[][] matrix, int k) {
        int numberOfShell = (matrix.length / 2) + (matrix.length % 2);

        for (int i = 1; i <= numberOfShell; i++) {
            int[] oneDimensionalArray = fillOneDimensionalArray(matrix, i);
            rotateArray(oneDimensionalArray, k);
            fillShellFromOneDimensionalArray(matrix, oneDimensionalArray, i);
        }

        display(matrix);
    }
    private int[] fillOneDimensionalArray(int[][] matrix, int shell) {
        int minRow = shell - 1;
        int minColumn = shell - 1;
        int maxRow = matrix.length - shell;
        int maxColumn = matrix[0].length - shell;

        int numberOfElements = 2 * (maxRow - minRow + maxColumn - minColumn);
        int[] oneDimensionalArray = new int[numberOfElements];
        int index = 0;

//        left wall
        for (int i = minRow, j = minColumn; i <= maxRow; i++) {
            oneDimensionalArray[index] = matrix[i][j];
            index++;
        }
        minColumn++;
//        bottom wall
        for (int i = maxRow, j = minColumn; j <= maxColumn; j++) {
            oneDimensionalArray[index] = matrix[i][j];
            index++;
        }
        maxRow--;
//        right wall
        for (int i = maxRow, j = maxColumn; i >= minRow; i--) {
            oneDimensionalArray[index] = matrix[i][j];
            index++;
        }
        maxColumn--;
//        top wall
        for (int i = minRow, j = maxColumn; j >= minColumn; j--) {
            oneDimensionalArray[index] = matrix[i][j];
            index++;
        }

        return oneDimensionalArray;
    }
    private void rotateArray(int[] arr, int k) {
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    private void reverse (int[] arr, int low, int high) {
        while (low < high) {
            swap(arr, low, high);
            low++; high--;
        }
    }
    private void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }
    private void fillShellFromOneDimensionalArray(int[][] matrix, int[] oneDimensionalArray, int shell) {
        int minRow = shell - 1;
        int minColumn = shell - 1;
        int maxRow = matrix.length - shell;
        int maxColumn = matrix[0].length - shell;

        int index = 0;

//        left wall
        for (int i = minRow, j = minColumn; i <= maxRow; i++) {
            matrix[i][j] = oneDimensionalArray[index];
            index++;
        }
        minColumn++;
//        bottom wall
        for (int i = maxRow, j = minColumn; j <= maxColumn; j++) {
            matrix[i][j] = oneDimensionalArray[index];
            index++;
        }
        maxRow--;
//        right wall
        for (int i = maxRow, j = maxColumn; i >= minRow; i--) {
            matrix[i][j] = oneDimensionalArray[index];
            index++;
        }
        maxColumn--;
//        top wall
        for (int i = minRow, j = maxColumn; j >= minColumn; j--) {
            matrix[i][j] = oneDimensionalArray[index];
            index++;
        }
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
