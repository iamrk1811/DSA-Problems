package questions.Tree.BinaryTree;

public class RemoveLeaveNode {
    public TreeNode solve(TreeNode node) {
        if (node == null) return null;
        if (node.left == null && node.right == null)
            return null;

        node.left = solve(node.left);
        node.right = solve(node.right);
        return node;
    }
}
