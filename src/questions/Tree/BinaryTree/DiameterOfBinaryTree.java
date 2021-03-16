package questions.Tree.BinaryTree;

public class DiameterOfBinaryTree {
//    inefficient
    public int solve(TreeNode node) {
        if (node == null) return 0;
        int left = solve(node.left);
        int right = solve(node.right);

        int throughRoot = height(node.left) + height(node.right) + 2;
        return Math.max(throughRoot, Math.max(left, right));
    }
    private int height(TreeNode node) {
        if (node == null) return -1;

        return Math.max(height(node.left), height(node.right)) + 1;
    }
    static class Pair {
        int height;
        int diameter;
    }
    public int solve2(TreeNode node) {
        Pair pair = calDiaHeight(node);
        return pair.diameter;
    }
    private Pair calDiaHeight(TreeNode node) {
        if (node == null) {
            Pair pair = new Pair();
            pair.diameter = 0;
            pair.height = -1;
            return pair;
        }

        Pair leftPair = calDiaHeight(node.left);
        Pair rightPair = calDiaHeight(node.right);

        Pair myPair = new Pair();

        myPair.height = Math.max(leftPair.height, rightPair.height) + 1;
        int fact = leftPair.height + rightPair.height + 2;
        myPair.diameter = Math.max(fact, Math.max(leftPair.diameter, rightPair.diameter));
        return myPair;
    }
}
