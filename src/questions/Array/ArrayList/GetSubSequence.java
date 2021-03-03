package questions.Array.ArrayList;

import java.util.ArrayList;

public class GetSubSequence {
    public ArrayList<String> solve(String str) {
        if (str.length() == 0) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        char ch = str.charAt(0);

        ArrayList<String> recRes = solve(str.substring(1));

        ArrayList<String> res = new ArrayList<>();
        for (String val : recRes) {
            res.add(ch + val);
            res.add("-" + val);
        }
        return res;
    }
}
