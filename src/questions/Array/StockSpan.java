package questions.Array;

import java.util.Stack;

public class StockSpan {
    public int[] solve(int[] arr, int n) {
        int[] res = new int[n];
        res[0] = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
//            1 1 1 2 1 4 6
            if (stack.isEmpty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return res;
    }
}
