import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import questions.Array.Matrix.RotateMatrix;

import questions.Array.MedianOfTwoSortedArray;
import questions.Array.MedianOfTwoSortedArray;
public class App {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        RotateMatrix obj = new RotateMatrix();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int n = arr.length;
        obj.rotate90AntiClockWise(matrix);

    }
}
