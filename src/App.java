import questions.Array.ArrayList.*;
import questions.Tree.BinaryTree.ConstructBinaryTreeFromArray;
import questions.Tree.BinaryTree.TreeNode;
import questions.Tree.GenericTree.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class App {
    public static void main(String[] args) throws IOException {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        ConstructGenericTreeFromArray obj2 = new ConstructGenericTreeFromArray();
        GenericTreeNode root = obj2.solve(arr);

        Integer[] binaryTreeArray = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        TreeNode node = ConstructBinaryTreeFromArray.construct(binaryTreeArray);


//        new PrintPermutations().print("ABCD","");
//        Test.test();
        new PrintEncoding().print("655196", "");
    }
}
