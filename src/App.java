import questions.DynamicProgramming.*;
import questions.HashHeap.MedianPriorityQueue;
import questions.HashHeap.MyHashMap;
import questions.HashHeap.MyPriorityQueue;
import questions.LinkedList.*;
import questions.StackAndQueue.*;
import questions.Tree.BinaryTree.*;
import questions.Tree.GenericTree.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class App {
    public static void main(String[] args) throws IOException {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        ConstructGenericTreeFromArray obj2 = new ConstructGenericTreeFromArray();
        GenericTreeNode root = obj2.solve(arr);

        Integer[] binaryTreeArray = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
//        Integer[] bna = {50, 25, 12, null, null, 37, 30, null, null, 51, null, null, 75, 62, 60, null, null, 70, null, null, null};
        Integer[] bna = {50, 25, 12, null, null, 37, null, null, 75, 62, null, null, 87, null, null};
//        TreeNode node = ConstructBinaryTreeFromArray.construct(bna);
        TreeNode nodeT = ConstructBinaryTreeFromArray.construct(bna);


        System.out.println(new CountABCSubsequence().solve("abcabc"));
    }
}
