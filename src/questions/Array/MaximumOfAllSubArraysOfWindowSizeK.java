package questions.Array;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumOfAllSubArraysOfWindowSizeK {
    public int[] solve(int[] arr, int k) {
        int[] res = new int[arr.length - k + 1];
        int i = 0, j = 0, idx = 0;


        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(Integer.MIN_VALUE);
        int max = Integer.MIN_VALUE;
        while (j < arr.length) {
            if (arr[j] > max) {
                max = arr[j];
                if (queue.peek() != null && queue.peek() < max) {
                    queue.remove();
                    queue.add(arr[j]);
                }
                if (queue.isEmpty()) queue.add(arr[j]);
            }

            if (j - i + 1 == k) {
//                when we hit the window size
                if (queue.isEmpty()) res[idx] = 0;
                else {
                    res[idx] = queue.peek();
//                    we are going to remove the element
//                    only if the element is out of range
                    if (queue.peek() == arr[i]) queue.remove();
                    i++;
                    idx++;
                }
            }
            j++;
        }
        return res;
    }
}
