import questions.LinkedList.Node;

import java.lang.reflect.Array;
import java.util.*;
public class Test {

    public static int test(int[] value, int[] weight, int n, int w) {
        if (n == 0 || w < 0) return 0;

        if (weight[n - 1] <= w) {
            int with = value[n - 1] + test(value, weight, n - 1, w - weight[n -1]);
            int without = test(value, weight, n - 1, w);
            return Math.max(with, without);
        } else {
            return test(value, weight, n - 1, w);
        }
    }
}