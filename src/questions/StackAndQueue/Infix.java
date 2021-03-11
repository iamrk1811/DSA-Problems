package questions.StackAndQueue;

import java.util.Stack;

public class Infix {
    public void evaluation(String str) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    char op = operator.pop();
                    int x = operand.pop();
                    int y = operand.pop();
                    int res = eval(y, x, op);
                    operand.push(res);
                }
                operator.pop();

            } else if (Character.isDigit(ch)) {
                operand.push(ch - 48); // - '0'
            } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                while (!operator.isEmpty() && operator.peek() != ')' && precedence(ch) <= precedence(operator.peek())) {
                    char op = operator.pop();
                    int x = operand.pop();
                    int y = operand.pop();
                    int res = eval(y, x, op);
                    operand.push(res);
                }
                operator.push(ch);

            }
        }
        while (!operator.isEmpty()) {
            char op = operator.pop();
            int x = operand.pop();
            int y = operand.pop();
            int res = eval(y, x, op);
            operand.push(res);
        }
        System.out.println(operand.peek());
    }

    private int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else return 2;
    }

    private int eval(int x, int y, char op) {
        if (op == '-') {
            return x - y;
        } else if (op == '+') {
            return x + y;
        } else if (op == '/') {
            return x / y;
        } else return x * y;
    }
}
