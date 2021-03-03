package questions.Array.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Keyboard Possible Combinations
public class KPC {
    public ArrayList<String> solve(String[] arr, String input) {
        if (input.length() == 0) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        char ch = input.charAt(0);
        String restOfTheInput = input.substring(1);

        ArrayList<String> recRes = solve(arr, restOfTheInput);

        String firstString = arr[(int) ch - 48];

        ArrayList<String> myRes = new ArrayList<>();
        for (int i = 0; i < firstString.length(); i++) {
            char x = firstString.charAt(i);
            for (String temp : recRes) {
                myRes.add(x + temp);
            }
        }
        return myRes;
    }
}
