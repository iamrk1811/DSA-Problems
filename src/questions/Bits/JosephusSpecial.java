package questions.Bits;

public class JosephusSpecial {
    public int solve(int num) {
        /*
            formula -> num == 2^x + l [2^x <= num]
            result = 2l + 1
         */

        int mostPower = getPower(num);
        int l = num - mostPower;
        return 2 * l + 1;
    }
    private int getPower(int num) {
        int po = 1;
        while (po * 2 <= num) {
            po *= 2;
        }
        return po;
    }
}
