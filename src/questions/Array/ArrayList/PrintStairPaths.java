package questions.Array.ArrayList;

public class PrintStairPaths {
    public void print(int destination, String ans) {
//        you are allowed to take 1, 2 or 3 Steps at a time
        if (destination <=  0) {
            if (destination == 0) {
                System.out.println(ans);
                return;
            }
            return;
        }
        print(destination - 1, ans + "1");
        print(destination - 2, ans + "2");
        print(destination - 3, ans + "3");
    }
}
