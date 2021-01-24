package questions.Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {
    public int solve(int[][] matrix, int target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                pq.add(matrix[i][j]);
            }
        }

        for (int i = 1; i < target; i++) {
            pq.remove();
        }
        return pq.peek() == null ? 0 : pq.peek();
    }
}
