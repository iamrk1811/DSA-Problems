package questions.LinkedList;

public class Add1ToNumberRepresentedAsLinkedList {
    public Node addOne(Node head) {
        int carry = solve(head);
        if (carry == 1) {
            Node node = new Node(1);
            node.next = head;
            return node;
        }
        return head;
    }
    private int solve(Node node) {
        if (node.next == null) {
            int data = node.data + 1;
            if (data >= 10) {
                node.data = data % 10; // last digit
                return data / 10; // carry
            } else {
                node.data = data;
                return 0;
            }
        }

        int carry = solve(node.next);
        int data = node.data + carry;
        if (data >= 10) {
            node.data = data % 10; // last digit
            return data / 10; // carry
        } else {
            node.data = data;
            return 0;
        }
    }
}
