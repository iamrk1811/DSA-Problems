package questions.Array;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public int solve(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();

            if (stack.isEmpty()) left[i] = 0;
            else left[i] = stack.peek() + 1;

            stack.push(i);
        }

        stack.clear();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();

            if (stack.isEmpty()) right[i] = arr.length - 1;
            else right[i] = stack.peek() - 1;

            stack.push(i);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int width = right[i] - left[i] + 1;
            int height = arr[i];
            max = Math.max(width * height, max);
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return max;
    }

}
