package questions.LinkedList;

public class MergeTwoSortedLinkedList {
    public MyLinkedList solve(MyLinkedList list1, MyLinkedList list2) {
        MyLinkedList res = new MyLinkedList();
        Node node1 = list1.head;
        Node node2 = list2.head;
        while (node1 != null && node2 != null) {
            if (node1.data < node2.data) {
                res.addLast(node1.data);
                node1 = node1.next;
            } else {
                res.addLast(node2.data);
                node2 = node2.next;
            }
        }
        while (node1 != null) {
            res.addLast(node1.data);
            node1 = node1.next;
        }
        while (node2 != null) {
            res.addLast(node2.data);
            node2 = node2.next;
        }
        return res;
    }
}
