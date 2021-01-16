package questions.Bits;

import java.util.ArrayList;

public class GrayCode {
    public ArrayList<String> solve(int num) {
        if (num == 1) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("0"); temp.add("1");
            return temp;
        }

        ArrayList<String> res = solve(num - 1);
        ArrayList<String> myres = new ArrayList<>();

//        original order
        for (int i = 0; i < res.size(); i++) {
            myres.add("0" + res.get(i));
        }
//        reverse order
        for (int i = res.size() - 1; i >= 0; i--) {
            myres.add("1" + res.get(i));
        }

        return myres;
    }
}
