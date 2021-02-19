package questions.Tree.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelLineWiseBinary {
    public void solve(TreeNode node) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        queue.add(new TreeNode(Integer.MIN_VALUE, null, null));

        while (queue.size() > 1) {
            TreeNode temp = queue.remove();

            if (temp.data != Integer.MIN_VALUE) {
                System.out.print(temp.data + " ");
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            } else {
                System.out.println();
                queue.add(new TreeNode(Integer.MIN_VALUE, null, null));
            }
        }
    }
    public void solve2(TreeNode node) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                System.out.print(temp.data + " ");
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            System.out.println();
        }
    }
}
