package questions.Tree.BinaryTree;

public class Tilt {
    static int tilt = 0;
    public int solve(TreeNode node) {
        help(node);
        return tilt;
    }
    private int help(TreeNode node) {
        if(node == null){
            return 0;
        }

        int ls = help(node.left);
        int rs = help(node.right);

        int ts = ls + rs + node.data;

        tilt += Math.abs(ls - rs);

        return ts;
    }
}
