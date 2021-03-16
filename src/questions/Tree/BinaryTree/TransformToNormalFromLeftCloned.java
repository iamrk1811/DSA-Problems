package questions.Tree.BinaryTree;

public class TransformToNormalFromLeftCloned {
    public TreeNode solve(TreeNode node) {
        if (node == null) return null;

        TreeNode left = solve(node.left.left);
        TreeNode right = solve(node.right);

        node.right = right;
        node.left = left;

        return node;
    }
}
