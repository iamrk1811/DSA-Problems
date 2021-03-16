package questions.Tree.BinaryTree;

public class PrintSingleChildOnly {
    public void solve(TreeNode node) {
        if (node == null) return;

        if (node.left != null && node.right == null) {
            System.out.println(node.left.data);
            return;
        } else if (node.right != null && node.left == null) {
            System.out.println(node.right.data);
            return;
        }

        solve(node.left);
        solve(node.right);
    }
}
