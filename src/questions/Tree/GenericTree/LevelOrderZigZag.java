package questions.Tree.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class LevelOrderZigZag {
    public ArrayList<Integer> solve(GenericTreeNode node) {
        Stack<GenericTreeNode> mainStack = new Stack<>();
        Stack<GenericTreeNode> childStack = new Stack<>();

        mainStack.push(node);

        ArrayList<Integer> res = new ArrayList<>();
        boolean direction = true;

        while (!mainStack.isEmpty()) {
            GenericTreeNode temp = mainStack.pop();
            res.add(temp.data);

            if (direction) {
                childStack.addAll(temp.children);
            } else {
                for (int i = temp.children.size() - 1; i >= 0; i--)
                    childStack.add(temp.children.get(i));
            }

            if (mainStack.isEmpty()) {
                direction = !direction;
                Stack<GenericTreeNode> tempStack = mainStack;
                mainStack = childStack;
                childStack = tempStack;
            }

        }

        return res;
    }
}
