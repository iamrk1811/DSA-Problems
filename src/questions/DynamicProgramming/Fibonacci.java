package questions.DynamicProgramming;

public class Fibonacci {
    public int solve(int n, int[] qb) {
        if (n == 1 || n == 0) return n;

        if (qb[n] > 0) {
            return qb[n];
        }

        int fib = solve(n - 1, qb) + solve(n - 2, qb);
        qb[n] = fib;

        return fib;
    }
}
