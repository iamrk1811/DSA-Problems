package questions.Tree.BinaryTree;

public class PrintKLevelDown {
    public void print(TreeNode node, int k) {
        if (node == null || k < 0) return;

        if (k == 0) {
            System.out.print(node.data + " ");
        }

        print(node.left, k - 1);
        print(node.right, k - 1);
    }
}
