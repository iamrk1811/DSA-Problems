package questions.LinkedList;

public class MyLinkedList {
    public int size = 0;
    Node head = null;
    Node tail = null;
    public void printLinkedList() {
         if (this.size == 0) {
             System.out.println("LinkedList is empty !");
         } else {
             Node temp = this.head;
             for (int i = 0; i < this.size; i++) {
                 System.out.print(temp.data + "->");
                 temp = temp.next;
             }
         }
        System.out.println("NULL");
    }
    public void addFirst(int data) {
        if (this.size == 0) {
            this.tail = this.head = new Node(data);
        } else {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }
        this.size++;
    }
    public int removeFirst() {
        if (this.size == 0) {
            System.out.println("LinkedList is empty !");
            return -1;
        } else {
            int val = head.data;
            this.head =  head.next;
            this.size--;
            return val;
        }
    }
    public void addLast(int data) {
        if (this.size == 0) {
            this.head = this.tail = new Node(data);
        } else {
            Node temp = this.head;
            Node node = new Node(data);

            for (int i = 0; i < this.size - 1; i++) {
                temp = temp.next;
            }
            temp.next = node;
            this.tail = temp;
        }
        this.size++;
    }
    public int removeLast() {
        if (this.size == 0) {
            System.out.println("LinkedList is Empty !");
            return -1;
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.size - 2; i++) {
                temp = temp.next;
            }
            int val = temp.next.data;
            temp.next = null;
            this.tail = temp;
            this.size--;
            return val;
        }
    }
    public Node getNodeAt(int key) {
        if (this.size == 0) {
            System.out.println("LinkedList is Empty !");
            return new Node();
        } else {
            Node temp = this.head;
            for (int i = 0; i < key; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }
    public int removeAt(int key) {
        if (this.size == 0) {
            System.out.println("LinkedList is empty !");
            return -1;
        } else {
            Node temp = this.head;
            for (int i = 0; i < key - 1; i++) {
                temp = temp.next;
            }
            int val = temp.next.data;
            temp.next = temp.next.next;
            this.size--;
            return val;

        }
    }
}