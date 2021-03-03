package questions.Array.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetStairPaths {
    public ArrayList<String> solve(int input) {
        if (input <= 0) {
            ArrayList<String> temp = new ArrayList<>();
            if (input == 0) {
                temp.add("");
            }
            return temp;
        }

        ArrayList<String> paths1 = solve(input - 1);
        ArrayList<String> paths2 = solve(input - 2);
        ArrayList<String> paths3 = solve(input - 3);

        ArrayList<String> paths = new ArrayList<>();
        for (String path : paths1)
            paths.add("1" + path);

        for (String path : paths2)
            paths.add("2" + path);

        for (String path : paths3)
            paths.add("3" + path);

        return paths;
    }
}
