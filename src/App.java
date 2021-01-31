
import questions.LinkedList.LinkedList;
import questions.LinkedList.Node;
import questions.LinkedList.ReverseLinkedList;
import questions.SearchingAndSorting.CountSubArrayWithSumZero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class App {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        Node node1  = new Node(1);
        Node node2  = new Node(2);
        Node node3  = new Node(3);
        Node node4  = new Node(4);
        Node node5  = new Node(5);
        Node node6  = new Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        LinkedList.printLinkedList(node1);
        Node node = new ReverseLinkedList().reverseLoop2(node1);
        LinkedList.printLinkedList(node);
    }
}
