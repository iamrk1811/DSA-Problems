package questions.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

class Pair {
    TreeNode node;
    int val = 1;

    public Pair(TreeNode node) {
        this.node = node;
    }
}

public class ConstructBinaryTreeFromArray {
    public static TreeNode construct(Integer[] arr) {
        Stack<Pair> stack = new Stack<>();
        TreeNode root = new TreeNode(arr[0], null, null);
        stack.push(new Pair(root));
        int idx = 0;
        while (stack.size() > 0) {
            Pair item = stack.peek();
            if (item.val == 1) {
//                 left node
                idx++;
                if (arr[idx] != null) {
                    item.node.left = new TreeNode(arr[idx], null, null);
                    Pair pair = new Pair(item.node.left);
                    stack.push(pair);
                } else {
                    item.node.left = null;
                }
                item.val++;
            } else if (item.val == 2) {
//                 right node
                idx++;
                if (arr[idx] != null) {
                    item.node.right = new TreeNode(arr[idx], null, null);
                    Pair pair = new Pair(item.node.right);
                    stack.push(pair);
                } else  {
                    item.node.right = null;
                }
                item.val++;
            } else {
                stack.pop();
            }
        }
        return root;
    }
}
