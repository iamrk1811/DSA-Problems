package questions.Array;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindNegativeIntegerOfEveryWindowSizeK {
    public int[] solve(int[] arr, int k) {
        Queue<Integer> queue = new ArrayDeque<>();

        int[] res = new int[arr.length - k + 1];

        int i = 0, j = 0;
        int idx = 0;
        while (j < arr.length) {
//            we found negative number
            if (arr[j] < 0) queue.add(arr[j]);

            if (j - i + 1 == k) {
//                we hit the window size
                if (queue.isEmpty()) res[idx] = 0;
                else {
                    res[idx] = queue.peek();
                    if (queue.peek() == arr[i]) queue.remove();
                    i++; idx++;
                }
            }
            j++;
        }
        return res;
    }
}
