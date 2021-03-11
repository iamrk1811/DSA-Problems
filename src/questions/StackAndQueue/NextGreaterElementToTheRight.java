package questions.StackAndQueue;

import java.util.Stack;

public class NextGreaterElementToTheRight {
    public int[] solve(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        res[arr.length - 1] = -1;
        stack.push(res[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            if (stack.isEmpty())
                res[i] = -1;
            else
                res[i] = stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
}
