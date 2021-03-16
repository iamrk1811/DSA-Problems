package questions.Tree.BinaryTree;

public class TransformToLeftClonedTree {
    public TreeNode solve(TreeNode node) {
        if (node == null) {
            return null;
        }

        TreeNode leftNode = solve(node.left);
        TreeNode rightNode = solve(node.right);

        TreeNode cloned = new TreeNode(node.data, leftNode, null);
        node.left = cloned;
        node.right = rightNode;

        return node;
    }
}
