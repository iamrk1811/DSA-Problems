package questions.Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementN3 {
    public List<Integer> solve(int[] arr) {

        int majorityCount = (arr.length / 3) + 1;

        int num1, num2; num1 = num2 = -1;
        int count1, count2; count1 = count2 = 0;

        for (int val: arr) {
            if (num1 == val) count1++;
            else if (num2 == val) count2++;
            else if (count1 == 0) {
                count1 = 1;
                num1 = val;
            } else if (count2 == 0) {
                count2 = 1;
                num2 = val;
            } else {
                count1--; count2--;
            }
        }
        count1 = count2 = 0;
        for (int val: arr) {
            if (val == num1) count1++;
            if (val == num2) count2++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        if (count1 >= majorityCount) res.add(num1);
        if (count2 >=  majorityCount && num1 != num2) res.add(num2);
        return res;
    }
}
