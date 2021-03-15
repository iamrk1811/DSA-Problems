package questions.Tree.BinarySearchTree;

//import questions.Tree.BinaryTree.TreeNode;

import questions.Tree.BinaryTree.TreeNode;

public class ConstructBinarySearchTree {
//    required sorted array to construct BST
    public TreeNode construct(int[] arr, int low, int high) {
        if (low > high) return null;

        int mid = (low + high) / 2;

        int data = arr[mid];
        TreeNode left = construct(arr, low, mid - 1);
        TreeNode right = construct(arr, mid + 1, high);

        TreeNode node = new TreeNode(data, left, right);
        return node;
    }
}
