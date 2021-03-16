package questions.Tree.BinaryTree;

public class NodeToRootPath {
    public void solve(TreeNode node, String ans, int target) {
        if (node == null) {
            return;
        }

        if (node.data == target) {
            System.out.println(ans + node.data);
            return;
        }

        solve(node.left, ans + node.data + "->", target);

        solve(node.right, ans + node.data + "->", target);

    }
}
