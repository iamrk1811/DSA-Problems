package questions.Bits;

public class KernighansAlgorithm {
    public int solve(int num) {
        /**
         *Count the number of 1's occurs in a number (binary)
         */
        int counter = 0;
        while (num > 0) {
            int rsb = num & -num;
            num -= rsb;
            counter++;
        }

        return counter;
    }

}
