package questions.Tree.GenericTree;

import java.awt.*;
import java.util.*;

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
    public void solve2(GenericTreeNode node) {
        Queue<GenericTreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        queue.add(new GenericTreeNode(Integer.MIN_VALUE));
        while (queue.size() > 1) {
            GenericTreeNode temp = queue.peek();
            if (temp.data != Integer.MIN_VALUE) {
                System.out.print(temp.data + " ");
                queue.addAll(temp.children);
            } else {
                queue.add(new GenericTreeNode(Integer.MIN_VALUE));
                System.out.println();
            }
            queue.remove();
        }
        queue.clear();

    }
}
