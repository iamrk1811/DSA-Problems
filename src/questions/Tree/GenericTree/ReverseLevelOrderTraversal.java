package questions.Tree.GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
    public ArrayList<Integer> solve(GenericTreeNode node) {
        Stack<GenericTreeNode> stack = new Stack<>();
        Queue<GenericTreeNode> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GenericTreeNode temp = queue.remove();
            stack.push(temp);
            for (int i = temp.children.size() - 1; i >= 0; i--) {
                if (temp.children.get(i) != null) queue.add(temp.children.get(i));
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty())
            res.add(stack.pop().data);
        return res;
    }
}
