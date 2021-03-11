package questions.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SlidingWindowMaximum {
    public int[] solve2(int[] arr, int k) {
//        solved using next greater element
        int[] res = new int[arr.length - k + 1];

//        finding next greater element to the right
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        int[] right = new int[arr.length];
        right[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            if (stack.isEmpty())
                right[i] = arr.length;
            else
                right[i] = stack.peek();
            stack.push(i);
        }
        for (int i = 0; i <= arr.length - k; i++) {
            int j = i;
            while (right[j] < i + k) {
                j = right[j];
            }
            res[i] = arr[j];
        }
        return res;
    }
    public int[] solve(int[] arr, int k) {
        int[] res = new int[arr.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0, j = 0, idx = 0;
        while (j < arr.length) {
            if (j - i + 1 == k) {
//                when window size is hit
                if (dq.isEmpty()) {
//                    but still our Deque is empty
//                    this is the base case where K == 1
                    dq.addLast(arr[j]);
                    res[idx] = dq.peekFirst() == null ? 0 : dq.peekFirst();
                    idx++;

                    if (dq.peekFirst() == arr[i])
                        dq.removeFirst();

                    i++; j++;
                } else {
                    while (!dq.isEmpty() && dq.peekLast() < arr[j]) dq.removeLast();
                    dq.addLast(arr[j]);

                    res[idx] = dq.peekFirst() == null ? 0 : dq.peekFirst();
                    idx++;

                    if (dq.peekFirst() == arr[i])
                        dq.removeFirst();

                    i++; j++;
                }
            } else {
//                When we still not hit the window size k
                while (!dq.isEmpty() && dq.peekLast() < arr[j]) dq.removeLast();
                dq.addLast(arr[j]);
                j++;
            }
        }
        return res;
    }
}
