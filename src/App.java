import questions.Array.ArrayList.GetMazePaths;
import questions.Array.ArrayList.GetStairPaths;
import questions.Array.ArrayList.GetStairPathsCount;
import questions.Tree.BinaryTree.ConstructBinaryTreeFromArray;
import questions.Tree.BinaryTree.TreeNode;
import questions.Tree.GenericTree.*;

import java.io.IOException;
import java.util.ArrayList;

class App {
    public static void main(String[] args) throws IOException {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        ConstructGenericTreeFromArray obj2 = new ConstructGenericTreeFromArray();
        GenericTreeNode root = obj2.solve(arr);

        Integer[] binaryTreeArray = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        TreeNode node = ConstructBinaryTreeFromArray.construct(binaryTreeArray);

        ArrayList<String> res = new GetMazePaths().solve(1,1,3,3);
        System.out.println(res.size());
        System.out.println(res);
//        Test.test();
    }
}
