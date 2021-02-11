package questions.LinkedList;

import java.awt.*;

public class ReverseLinkedList {
    public Node reverseLoop1(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node node = new Node(temp.data);
            if (prev == null) node.next = null;
            else node.next = prev;

            prev = node;
            temp = temp.next;
        }
        return prev;
    }
    public Node reverseLoop2(Node head) {
        Node prev = null, current = head, next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
    public Node recursive(Node head) {
        if (head == null || head.next == null) return head;

        Node node = recursive(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
