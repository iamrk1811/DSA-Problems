package questions.LinkedList;

public class RemoveDuplicatesInSortedLinkedList {
    public Node Solve(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
