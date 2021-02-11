package questions.LinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class DetectCycle {
    public boolean solve1(Node head) {
        Node temp = head;
        HashSet<Node> set = new HashSet<>();

        while (temp != null && !set.contains(temp)) {
            set.add(temp); temp = temp.next;
        }

        if (temp == null) return false;
        else if (set.contains(temp)) return true;
        else return false;
    }
    public boolean solve2(Node head) {
        if (head == null || head.next == null) return false;
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }
}
