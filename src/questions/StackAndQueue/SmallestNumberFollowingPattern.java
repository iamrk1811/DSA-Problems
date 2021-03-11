package questions.StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

public class SmallestNumberFollowingPattern {
    public ArrayList<Integer> solve(String str) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int number = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'd') {
                number++;
                stack.push(number);
            } else if (ch == 'i') {
                number++;
                stack.push(number);
                while (!stack.isEmpty()) {
                    res.add(stack.pop());
                }
            }
        }
        number++;
        stack.push(number);
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}
