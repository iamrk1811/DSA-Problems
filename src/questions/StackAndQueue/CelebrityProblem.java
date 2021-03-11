package questions.StackAndQueue;

import java.util.Stack;

public class CelebrityProblem {
    public int solve(int[][] matrix) {
        int len = matrix.length - 1;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= len; i++) stack.push(i);

        while (stack.size() >= 2) {
            int index1 = stack.pop();
            int index2 = stack.pop();

            if (matrix[index1][index2] == 1) {
                stack.push(index2);
            } else {
                stack.push(index1);
            }
        }
        int canBe = stack.peek();

        for (int i = 0; i < matrix.length; i++) {
            if (i != canBe) {
                if (matrix[i][canBe] == 0 || matrix[canBe][i] == 1) return -1;
            }
        }

        return canBe;
    }
}
