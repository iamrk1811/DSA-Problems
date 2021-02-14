package questions.Tree.GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public void solve(GenericTreeNode node) {
        Queue<GenericTreeNode> queue = new ArrayDeque<>();

        queue.add(node); // add

        while (!queue.isEmpty()) {
            GenericTreeNode temp = queue.remove();
            System.out.println(temp.data);

            queue.addAll(temp.children);
        }
    }
}
