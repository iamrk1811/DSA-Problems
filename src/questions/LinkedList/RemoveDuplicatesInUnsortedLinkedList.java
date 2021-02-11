package questions.LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesInUnsortedLinkedList {
    public Node solve(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node current = head, prev = null;
        while (current != null) {
            if (!set.contains(current.data)) {
                set.add(current.data);
                prev = current;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        }
        return head;
    }
}
