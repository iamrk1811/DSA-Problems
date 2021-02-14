package questions.Tree.GenericTree;

import java.util.Stack;

public class ConstructGenericTreeFromArray {
    public GenericTreeNode solve(int[] arr) {
        Stack<GenericTreeNode> stack = new Stack<>();
        GenericTreeNode root = null;
        for (int val: arr) {
            if (val == -1) {
                stack.pop();
            } else {
                GenericTreeNode node = new GenericTreeNode(val);
                if (stack.isEmpty()) {
                    root = node;
                } else {
                    stack.peek().children.add(node);
                }
                stack.push(node);
            }
        }

        return root;
    }
}
