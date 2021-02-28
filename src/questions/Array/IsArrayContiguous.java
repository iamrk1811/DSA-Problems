package questions.Array;

import java.util.HashSet;

public class IsArrayContiguous {
    public boolean solve(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int val: arr) set.add(val);

        int startingPoint = Integer.MAX_VALUE;
        int endPoint = Integer.MIN_VALUE;
        for (int val: set) {
            if (val > endPoint) endPoint = val;
            if (!set.contains(val - 1) && val < startingPoint) startingPoint = val;
        }

        while (startingPoint < endPoint) {
            if (!set.contains(startingPoint + 1)) return false;
            else startingPoint++;
        }
        return true;
    }
}
