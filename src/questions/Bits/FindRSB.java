package questions.Bits;

public class FindRSB {
    public int solve(int num) {
        int rsb = (num & -num);
        return rsb;
    }
}
