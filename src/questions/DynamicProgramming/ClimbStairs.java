package questions.DynamicProgramming;

public class ClimbStairs {
    public int solve(int n) {
        int[] t = new int[n + 1];
        t[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            if (i == 1)
                t[i] = t[i - 1];
            else
                t[i] = t[i - 1] + t[i - 2];
        }
        return t[n];
    }
}
