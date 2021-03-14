package questions.LinkedList;

public class IntersectionPointOfTwoLinkedList {
    private int len(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
    public Node solve(Node headA, Node headB) {
        int length1 = len(headA);
        int length2 = len(headB);

        int dif = Math.abs(length1 - length2);

        if (length1 < length2) {
            for (int i = 0; i < dif; i++) {
                headB = headB.next;
            }
        } else {
            for (int i = 0; i < dif; i++) {
                headA = headA.next;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    public Node solve2(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
