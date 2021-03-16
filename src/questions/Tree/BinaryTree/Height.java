package questions.Tree.BinaryTree;

public class Height {
    public int solve(TreeNode node) {
        if (node == null) return -1;

        return Math.max(solve(node.left), solve(node.right)) + 1;
    }
}
