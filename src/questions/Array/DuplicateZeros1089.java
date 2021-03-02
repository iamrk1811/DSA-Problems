package questions.Array;

import java.util.Stack;

public class DuplicateZeros1089 {
    public int[] solve(int[] arr) {
//        28/30 test cases passed
//        two pass method

//        step 1 -> count the extra the zeros which will be part of
//        my new modified array O(N)
        int len = arr.length;
        int zerosCount = 0, nonZerosCount = 0;
        for (int val : arr) {
            if (val == 0) {
                zerosCount++;
                int exp = nonZerosCount + (zerosCount * 2);
                if (exp == len || exp - 1 == len) break;
            } else {
                nonZerosCount++;
                int exp = nonZerosCount + (zerosCount * 2);
                if (exp == len || exp - 1 == len) break;
            }
        }
        System.out.println(zerosCount);
//        zerosCount++;
//        step 2 -> pushing out the element
        int i = len - 1, j = len + zerosCount - 1;
        int flag = 1;
        while (i >= 0 && j >= 0) {
            if (j < len) {
//                in bound
                if (arr[i] == 0) {
                    arr[j] = 0;
                    j--;
                    arr[j] = 0;
                    j--;
                    i--;
                } else {
                    arr[j] = arr[i];
                    i--; j--;
                }
            } else {
//                out of bound
                i--; j--;
            }
        }
        return arr;
    }
    public int[] solve2(int[] arr) {
        int len = arr.length;

        Stack<Integer> stack = new Stack<>();

        int index = 0;

        while (stack.size() < len) {
            if (arr[index] == 0) {
                stack.push(0);
                stack.push(0);
            } else {
                stack.push(arr[index]);
            }
            index++;
        }
        while (stack.size() > len) stack.pop();

        for (int i = len - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
