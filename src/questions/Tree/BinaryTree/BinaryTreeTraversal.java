package questions.Tree.BinaryTree;

import java.util.Stack;

public class BinaryTreeTraversal {
    public static void preOrderIterative(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                stack.push(temp.left);
            if (temp.right != null)
                stack.push(temp.right);
        }
    }

    public static void preOrderRec(TreeNode node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrderRec(node.left);
        preOrderRec(node.right);
    }

    public static void inOrderRec(TreeNode node) {
        if (node == null) return;
        inOrderRec(node.left);
        System.out.print(node.data + " ");
        inOrderRec(node.right);
    }
    public static void inOrderIterative(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = node;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.pop();
                System.out.print(temp.data + " ");
                current = temp.right;
            }
        }
    }

    public static void postOrderIterativeUsingTwoStack(TreeNode node) {
        Stack<TreeNode> q1 = new Stack<>();
        Stack<TreeNode> q2 = new Stack<>();

        q1.push(node);

        while (!q1.isEmpty()) {
            TreeNode temp = q1.pop();
            q2.push(temp);
            if (temp.left != null)
                q1.push(temp.left);
            if (temp.right != null)
                q1.push(temp.right);
        }
        while (!q2.isEmpty()) {
            System.out.print(q2.pop().data + " ");
        }

    }
    public static void postOrderIterativeUsingOneStack(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
//        stack.push(node);
        TreeNode current = node, prev = null;
        while (current != null || !stack.isEmpty() ) {
            if (current != null) {
//                left part
                stack.push(current);
                current = current.left;
            } else {
//                right part
                if (stack.peek().right == null) {
//                    when nothing to add into the stack
                    prev = stack.pop();
                    System.out.print(prev.data + " ");
                    while (!stack.isEmpty() && stack.peek().right == prev) {
                        prev = stack.pop();
                        System.out.print(prev.data + " ");
                    }
                } else {
                    current = stack.peek().right;
                }
            }
        }
    }

    public static void postOrderRec(TreeNode node) {
        if (node == null) return;
        postOrderRec(node.left);
        postOrderRec(node.right);
        System.out.print(node.data + " ");
    }
}
