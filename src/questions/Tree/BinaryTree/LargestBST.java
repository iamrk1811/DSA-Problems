package questions.Tree.BinaryTree;

public class LargestBST {
    public void solve(TreeNode node) {
        Pair pair = isBST(node);
        System.out.println(pair.root.data + " @ " + pair.size);
    }
    static class Pair {
        int max;
        int min;
        boolean isBST;
        TreeNode root;
        int size;
    }

    private Pair isBST(TreeNode node) {
        if (node == null) {
            Pair pair = new Pair();
            pair.max = Integer.MIN_VALUE;
            pair.min = Integer.MAX_VALUE;
            pair.isBST = true;
            pair.root = null;
            pair.size = 0;
            return pair;
        }

        Pair leftPair = isBST(node.left);
        Pair rightPair = isBST((node.right));

        Pair myPair = new Pair();
        if (leftPair.isBST && rightPair.isBST && node.data <= rightPair.min && node.data >= leftPair.max) {
            myPair.isBST = true;
        } else {
            myPair.isBST = false;
        }

        myPair.min = Math.min(node.data, Math.min(leftPair.min, rightPair.min));
        myPair.max = Math.max(node.data, Math.max(leftPair.max, rightPair.max));

        if (myPair.isBST) {
            myPair.root = node;
            myPair.size = leftPair.size + rightPair.size + 1;
        } else if (leftPair.size < rightPair.size) {
            myPair.root = rightPair.root;
            myPair.size = rightPair.size;
        } else {
            myPair.root = leftPair.root;
            myPair.size = leftPair.size;
        }
        return myPair;
    }
}
