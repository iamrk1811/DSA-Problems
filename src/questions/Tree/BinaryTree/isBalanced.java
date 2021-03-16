package questions.Tree.BinaryTree;

public class isBalanced {
    public boolean solve(TreeNode node) {
        isBS = true;
        check(node);
        return isBS;
    }
    static boolean isBS = true;
    private int check(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = check(node.left);
        int rightHeight = check(node.right);


        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        int difference = Math.abs(leftHeight - rightHeight);

        if (difference > 1) {
            isBS = false;
        }

        return myHeight;
    }
}
