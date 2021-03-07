package questions.Stack;

import java.util.Stack;

public class LargestRectangleHistogram {
    public int solve(int[] arr) {
//        [2,1,5,6,2,3] = 10
        Stack<Integer> stack = new Stack<>();

//        left max
        int[] leftMax = new int[arr.length];
        leftMax[0] = 0;
        stack.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();

            if (stack.isEmpty()) {
                leftMax[i] = 0;
            } else {
                leftMax[i] = stack.peek() + 1;
            }
            stack.push(i);
        }

//        right max
        stack.clear();

        stack.push(arr.length - 1);
        int[] rightMax = new int[arr.length];
        rightMax[arr.length - 1] = arr.length - 1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();

            if (stack.isEmpty())
                rightMax[i] = arr.length - 1;
            else
                rightMax[i] = stack.peek() - 1;
            stack.push(i);
        }

        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSize = Math.max(maxSize, (rightMax[i] - leftMax[i] + 1) * arr[i]);
        }
        return maxSize;
    }
}
