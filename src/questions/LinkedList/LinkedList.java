package questions.LinkedList;

public class LinkedList {
    public static void printLinkedList(Node head) {
         Node temp = head;
         while (temp != null) {
             System.out.print(temp.data + "->");
             temp = temp.next;
         }
        System.out.println("NULL");
    }
}
