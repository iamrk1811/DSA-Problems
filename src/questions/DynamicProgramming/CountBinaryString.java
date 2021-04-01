package questions.DynamicProgramming;

public class CountBinaryString {
    public int solve(int n) {
        int old0 = 1;
        int old1 = 1;
        for (int i = 2; i <= n; i++) {
            int new0 = old1;
            int new1 = old1 + old0;
            old0 = new0;
            old1 = new1;
        }
        return old0 + old1; // for count binary string
//        return (int) Math.pow(old0 + old1, 2); // for building
    }
}
