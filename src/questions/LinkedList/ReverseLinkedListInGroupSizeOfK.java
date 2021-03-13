package questions.LinkedList;

import java.util.Collections;
import java.util.Stack;

public class ReverseLinkedListInGroupSizeOfK {
    public Node solve(Node head, int k) {
        Node current = head;
        Node prev = null;

        Stack<Node> stack = new Stack<>();
        while (current != null) {
            int count = 0;

            while (count < k && current != null) {
                stack.push(current);
                current = current.next;
                count++;
            }

            if (stack.size() < k) {
                Collections.reverse(stack);
                while (!stack.isEmpty()) {
                    prev.next = stack.pop();
                    prev = prev.next;
                }
            } else {
                while (!stack.isEmpty()) {
                    if (prev == null) {
                        prev = stack.pop();
                        head = prev;
                    } else {
                        prev.next = stack.pop();
                        prev = prev.next;
                    }
                }
            }

        }
        prev.next = null;
        return head;
    }
}
