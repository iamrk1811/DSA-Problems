package questions.StackAndQueue;

import java.util.Stack;

public class BalanceBrackets {
    public boolean solve(String str) {
        Stack<Character> stack = new Stack<>();
//        [(a + b) + {(c + d) * (e / f)}] -> true
//        [(a + b) + {(c + d) * (e / f)]} -> false
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('(' == ch || '{' == ch || '[' == ch) {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (')' == ch) {
                    while (!stack.isEmpty() && stack.peek() != '(') stack.pop();
                    if (stack.isEmpty()) return false;
                    else stack.pop();
                } else if (ch == '}') {
                    while (!stack.isEmpty() && stack.peek() != '{') stack.pop();
                    if (stack.isEmpty()) return false;
                    else stack.pop();
                } else {
                    while (!stack.isEmpty() && stack.peek() != '[') stack.pop();
                    if (stack.isEmpty()) return false;
                    else stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
