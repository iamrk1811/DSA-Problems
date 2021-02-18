package questions.Tree.BinaryTree;

import java.util.Stack;

public class Traversal {
    public void preOrderIterative(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            stack.push(temp.left);
            stack.push(temp.right);
        }
    }
    public void preOrderRec(TreeNode node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrderRec(node.left);
        preOrderRec(node.right);
    }
}
