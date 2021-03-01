package questions.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        // Base case for zero
        if (numRows == 0) return res;

        ArrayList<Integer> first = new ArrayList<>();

        first.add(1);

        res.add(first);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                int val = res.get(i - 1).get(j-1) + res.get(i - 1).get(j);
                temp.add(val);
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}
