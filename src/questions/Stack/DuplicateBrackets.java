package questions.Stack;

import java.util.Stack;

public class DuplicateBrackets {
    public boolean solve(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push('(');
            } else if (ch == ')') {
                if (stack.peek() == '(') return true;
                else {
                    while (!stack.isEmpty() && stack.peek() != '(') stack.pop();
                    if (!stack.isEmpty())
                        stack.pop();
                }
            } else
                stack.push(ch);
        }
        return false;
    }
}
