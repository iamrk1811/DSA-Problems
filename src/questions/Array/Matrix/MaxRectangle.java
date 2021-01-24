package questions.Array.Matrix;

import java.util.Stack;

public class MaxRectangle {
    public int solve(int[][] arr) {
        int columnSize = arr[0].length;

        int[] hist = new int[columnSize];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) hist[j] += arr[i][j];
                else hist[j] = 0;
            }
            max = calculateHistogramArea(hist, max);
        }

        return max;
    }
    private int calculateHistogramArea(int[] arr, int max) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
//        fill left limit
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();

            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;

            stack.push(i);
        }

        stack.clear();
//        fill right limit
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();

            right[i] = stack.isEmpty() ? arr.length - 1 : stack.peek() - 1;

            stack.push(i);
        }

//        calculate the area
        for (int i = 0; i < arr.length; i++) {
            int width = right[i] - left[i] + 1;
            int height = arr[i];
            int area = width * height;
            max = Math.max(area, max);
        }
        return max;
    }
}
