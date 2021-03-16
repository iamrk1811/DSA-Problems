package questions.Tree.BinaryTree;

import java.util.spi.AbstractResourceBundleProvider;

public class IsBinarySearchTree {
    public boolean solve(TreeNode node) {
        Pair pair = check(node);
        return pair.isBST;
    }
    static class Pair {
        boolean isBST;
        int max;
        int min;
    }
    private Pair check(TreeNode node) {
        if (node == null) {
            Pair pair = new Pair();
            pair.min = Integer.MAX_VALUE;
            pair.max = Integer.MIN_VALUE;
            pair.isBST = true;
            return pair;
        }

        Pair left = check(node.left);
        Pair right = check(node.right);

        Pair myPair = new Pair();
        if (left.isBST && right.isBST && left.max <= node.data && node.data <= right.min) {
            myPair.isBST = true;
        } else {
            myPair.isBST = false;
        }
        myPair.min = Math.min(node.data, Math.min(left.min, right.min));
        myPair.max = Math.max(node.data, Math.max(left.max, right.max));
        return myPair;
    }
}
