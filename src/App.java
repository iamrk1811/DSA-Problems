import questions.Graph.*;
import questions.Stack.*;
import questions.Tree.BinaryTree.ConstructBinaryTreeFromArray;
import questions.Tree.BinaryTree.TreeNode;
import questions.Tree.GenericTree.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class App {
    public static void main(String[] args) throws IOException {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        ConstructGenericTreeFromArray obj2 = new ConstructGenericTreeFromArray();
        GenericTreeNode root = obj2.solve(arr);

        Integer[] binaryTreeArray = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        TreeNode node = ConstructBinaryTreeFromArray.construct(binaryTreeArray);

//        Scanner scanner = new Scanner(System.in);
        ArrayList<Edge>[] graph = new CreateGraph().create();

//        ArrayList<EdgeWithoutWeight>[] graph = new CreateGraphWithoutWeight().create();
        new MinimumWireRequiredToConnect().find(graph, 0);
//        System.out.println(new IsGraphConnected().solve(graph, 0));
//        0 via 0 @ 0
//        1 via 01 @ 10
//        2 via 012 @ 20
//        5 via 0125 @ 25
//        4 via 01254 @ 28
//        6 via 01256 @ 28
//        3 via 012543 @ 30

    }
}
