package questions.LinkedList;

public class MidOfALinkedList {
    public int solve(MyLinkedList list) {
        Node slow = list.head;;
        if (slow == null) return -1;

        Node fast = slow;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
