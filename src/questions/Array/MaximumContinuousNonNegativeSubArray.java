package questions.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaximumContinuousNonNegativeSubArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();

//        Declare some variables

        long maxSum = Long.MIN_VALUE, currentSum = 0;
        int start = -1, end = -1;
        int tempStart = 0, tempEnd = 0;

        for (int i = 0; i < A.size(); i++) {
//            for positive number
            if (A.get(i) >= 0) {
                currentSum += A.get(i);

//                currentSum > maxSum
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = tempStart;
                    end = i;
                } else if (currentSum == maxSum && (tempEnd - tempStart) > (end - start)) {
//                    currentSum == maxSum
                    start = tempStart;
                    end = i;
                    maxSum = currentSum;
                }
                tempEnd++;
            } else {
//              for negative number
                tempStart = i + 1;
                tempEnd = i + 1;
                currentSum = 0;
            }
        }

        if (start == -1)
            return res;

        for (int i = start; i <= end; i++) {
            res.add(A.get(i));
        }
        return res;
    }
}
