package questions.LinkedList;

import java.util.Stack;

public class AddTwoLinkedList {
    public Node solve(Node first, Node second) {
        int len1 = len(first);
        int len2 = len(second);

        if (len1 == len2) {
        } else if (len1 < len2) {
            first = createExtraNode(first, len2 - len1);
        } else {
            second = createExtraNode(second, len1 - len2);
        }
        add(first, second);
        if (carry > 0) {
            Node temp = new Node(carry);
            temp.next = dummy;
            dummy = temp;
        }
        return dummy;
    }
    static Node dummy;
    static int carry = 0;
    private void add(Node first, Node second) {
        if (first == null) return;

        add(first.next, second.next);

        int sum = first.data + second.data;
        sum += carry;

        int digit = sum % 10;
        carry = sum / 10;

        if (dummy == null) {
            dummy = new Node(digit);
        } else {
            Node temp = new Node(digit);
            temp.next = dummy;
            dummy = temp;
        }
    }
    private Node reverse(Node node) {
        Node prev = null, current = node, next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    private int len(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
    private Node createExtraNode(Node node, int dif) {
        while (dif > 0) {
            dif--;

            Node temp = new Node(0);
            temp.next = node;
            node = temp;
        }
        return node;
    }
    public Node solve2(Node first, Node second) {
        int len1 = len(first);
        int len2 = len(second);

        if (len1 == len2) {
        } else if (len1 < len2) {
            first = createExtraNode(first, len2 - len1);
        } else {
            second = createExtraNode(second, len1 - len2);
        }

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (first != null) {
            stack1.push(first.data);
            stack2.push(second.data);
            first = first.next;
            second = second.next;
        }
        Node dummy = null;
        int carry = 0;
        while (!stack1.isEmpty()) {
            int data1 = stack1.pop();
            int data2 = stack2.pop();

            int sum = data1 + data2;
            sum += carry;

            int digit = sum % 10;
            carry = sum / 10;

            if (dummy == null) {
                dummy = new Node(digit);
            } else {
                Node temp = new Node(digit);
                temp.next = dummy;
                dummy = temp;
            }
        }

        if (carry > 0) {
            Node temp = new Node(carry);
            temp.next = dummy;
            dummy = temp;
        }


        return dummy;
    }
}
