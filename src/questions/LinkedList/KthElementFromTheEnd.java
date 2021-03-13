package questions.LinkedList;

public class KthElementFromTheEnd {
    public int solve(MyLinkedList list, int k) {
        if (list.size == 0) {
            System.out.println("LinkedList is Empty !");
            return -1;
        } else {
            Node slow = list.head;
            Node fast = slow;

            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow.data;

        }
    }
}
