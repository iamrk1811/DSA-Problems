import questions.Array.*;
import questions.Tree.BinaryTree.BinaryTreeTraversal;
import questions.Tree.BinaryTree.ConstructBinaryTreeFromArray;
import questions.Tree.BinaryTree.LevelLineWiseBinary;
import questions.Tree.BinaryTree.TreeNode;
import questions.Tree.GenericTree.*;

import java.io.IOException;
import java.util.Arrays;

class App {
    public static void main(String[] args) throws IOException {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        ConstructGenericTreeFromArray obj2 = new ConstructGenericTreeFromArray();
        GenericTreeNode root = obj2.solve(arr);

        Integer[] binaryTreeArray = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        TreeNode node = ConstructBinaryTreeFromArray.construct(binaryTreeArray);

        int[] res = new MaximumOfAllSubArraysOfWindowSizeK().solve(
                new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 3
        );
        System.out.println(Arrays.toString(res));
//        Test.test();
    }
}
