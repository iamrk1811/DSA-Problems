package questions.Math;

public class Power {
    public double pow(double x, int n) {
        boolean isNumberNegative = n < 0;
        double result = 1;
        while (n > 0) {
            if (n % 2 == 0) { // for even power
                x = x * x;
                n /= 2;
            } else { // for odd power
                result = result * x;
                n -= 1;
            }
        }

        if (isNumberNegative) result = (double)(1.0) / (double) result ;
        return result;
    }
}
