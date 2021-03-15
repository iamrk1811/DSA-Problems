import questions.HashHeap.MedianPriorityQueue;
import questions.HashHeap.MyHashMap;
import questions.HashHeap.MyPriorityQueue;
import questions.LinkedList.*;
import questions.StackAndQueue.*;
import questions.Tree.BinaryTree.BinaryTreeTraversal;
import questions.Tree.BinaryTree.ConstructBinaryTreeFromArray;
import questions.Tree.BinaryTree.TreeNode;
import questions.Tree.GenericTree.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class App {
    public static void main(String[] args) throws IOException {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        ConstructGenericTreeFromArray obj2 = new ConstructGenericTreeFromArray();
        GenericTreeNode root = obj2.solve(arr);

        Integer[] binaryTreeArray = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        TreeNode node = ConstructBinaryTreeFromArray.construct(binaryTreeArray);

//        BinaryTreeTraversal.postOrderIterativeUsingOneStack(node);
        BinaryTreeTraversal.postOrderTraversalUsingOneStack2(node);

        MyLinkedList list1 = new MyLinkedList();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = null;

        Node addNode1 = new Node(9);
        Node addNode2 = new Node(9);
        Node addNode3 = new Node(9);
        Node addNode4 = new Node(9);


        addNode1.next = addNode2;
        addNode2.next = addNode3;
        addNode3.next = addNode4;
        addNode4.next = null;

        Node add2Node1 = new Node(9);
        Node add2Node2 = new Node(9);
        Node add2Node3 = new Node(9);
        add2Node1.next = add2Node2;
        add2Node2.next = add2Node3;
        add2Node3.next = null;



//        list1.printLinkedList();
    }
}
