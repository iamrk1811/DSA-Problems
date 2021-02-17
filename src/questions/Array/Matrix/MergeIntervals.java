package questions.Array.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {
    public ArrayList<int[]> solve(int[][] matrix) {
        Arrays.sort(matrix, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return 0;
                else if (o1[0] > o2[0]) return 1;
                else return -1;
            }
        });

        Stack<int[]> stack = new Stack<>();
        stack.push(matrix[0]);

        for (int i = 1; i < matrix.length; i++) {
            if (stack.peek()[1] > matrix[i][0]) {
                int[] temp = stack.pop();
                int[] newArray = new int[2];
                newArray[0] = temp[0];
                newArray[1] = Math.max(temp[1], matrix[i][0]);
                stack.push(newArray);
            } else {
                stack.push(matrix[i]);
            }
        }

        return new ArrayList<>(stack);
    }
    public ArrayList<int[]> solve2(int[][] matrix) {
        Arrays.sort(matrix, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) return 0;
                else if (a[0] > b[0]) return 1;
                else return -1;
            }
        });
        int index = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[index][1] > matrix[i][0]) {
                matrix[index][1] = Math.max(matrix[i][1], matrix[index][1]);
            } else {
                index++;
                matrix[index][0] = matrix[i][0];
                matrix[index][1] = matrix[i][1];
            }
        }
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i <= index; i++) {
            res.add(matrix[i]);
        }
        return res;
    }
}
