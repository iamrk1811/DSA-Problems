package questions.Tree.BinaryTree;

import java.util.ArrayList;

public class PrintNodeKDistanceAway {
    static ArrayList<TreeNode> path = new ArrayList<>();
    public void print(TreeNode node, int data, int k) {
        find(node, data);
        for (int i = 0; i < path.size(); i++) {
            printKLevelDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1));
        }
    }
    private void printKLevelDown(TreeNode node, int k, TreeNode blocker) {
        if (node == null || k < 0 || node == blocker) return;
        if (k == 0)
            System.out.println(node.data);

        printKLevelDown(node.left, k - 1, blocker);
        printKLevelDown(node.right, k - 1, blocker);
    }

    private boolean find(TreeNode node, int data) {
        if (node == null) return false;

        if (node.data == data) {
            path.add(node);
            return true;
        }

        boolean leftRes = find(node.left, data);
        if (leftRes) {
            path.add(node);
            return true;
        }

        boolean rightRes = find(node.right, data);
        if (rightRes) {
            path.add(node);
            return true;
        }

        return false;
    }

}
