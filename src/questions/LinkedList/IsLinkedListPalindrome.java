package questions.LinkedList;

import java.util.Stack;

public class IsLinkedListPalindrome {
    private Node left;
    public boolean isPalindrome(Node node) {
        left = node;
        return isPalindromeHelper(node);
    }

    private boolean isPalindromeHelper(Node right) {
        if (right == null) return true;

        boolean res = isPalindromeHelper(right.next);

        if(!res) return false;

        if (left.data != right.data) return false;
        else {
            left = left.next;
            return true;
        }
    }
    public boolean isPalindrome2(Node node){
        Node left = node;

        Stack<Node> stack = new Stack<>();

        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        while (!stack.isEmpty()) {
            Node right = stack.pop();

            if (left.data != right.data)
                return false;
            else
                left = left.next;
        }
        return true;
    }
}
