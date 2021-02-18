import questions.Array.KthLargestElement;
import questions.Array.LargestSumContiguousArray;
import questions.Array.Matrix.MergeIntervals;
import questions.Array.MergeTwoSortedArrayWithoutExtraSpace;
import questions.LinkedList.LinkedList;
import questions.LinkedList.Node;
import questions.LinkedList.ReverseLinkedList;
import questions.Queue.MyQueue;
import questions.SearchingAndSorting.CountSubArrayWithSumZero;
import questions.Stack.MyStack;
import questions.Stack.TwoStackUsingArray;
import questions.Tree.GenericTree.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


class App {
    public static void main(String[] args) throws IOException {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        ConstructGenericTreeFromArray obj2 = new ConstructGenericTreeFromArray();
        GenericTreeNode root = obj2.solve(arr);


//        System.out.println();
//        Test.test();
    }
}
