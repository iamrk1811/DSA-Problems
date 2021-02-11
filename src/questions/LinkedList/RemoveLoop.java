package questions.LinkedList;

import java.util.HashSet;

public class RemoveLoop {
    public void solve1(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node prev = null, temp = head;

        while (temp != null && !set.contains(temp)) {
            set.add(temp);
            prev = temp;
            temp = temp.next;
        }
        if (set.contains(temp)) {
            prev.next = null;
        }
    }
    public void solve2(Node head) {
        if (head == null || head.next == null || head.next.next == null) return;

        Node slow, fast;
        slow = fast = head;

        boolean isLoopExist = false;
        Node prev = null;

        while (fast.next != null && fast.next.next != null) {
            prev = fast.next;
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                isLoopExist = true;
                break;
            }
        }

        slow = head;

        if (isLoopExist) {
            if (fast == slow) {
                prev.next = null;
                return;
            }
            while (fast.next != slow.next) {
                fast = fast.next; slow = slow.next;
            }
            fast.next = null;
        }
    }
}
