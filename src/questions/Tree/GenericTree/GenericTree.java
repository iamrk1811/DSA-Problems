package questions.Tree.GenericTree;

public class GenericTree {
    public static void display(GenericTreeNode root) {
        if (root == null) return;
        StringBuilder str = new StringBuilder(root.data + " -> ");
        for (GenericTreeNode node: root.children) {
            str.append(" ").append(node.data);
        }
        System.out.println(str);
        for (int i = 0; i < root.children.size(); i++) {
            display(root.children.get(i));
        }
    }
    public static int size(GenericTreeNode node) {
        if (node == null) return 0;
        int count = 1;
        for (GenericTreeNode temp: node.children) {
            count += size(temp);
        }
        return count;
    }
    public static int max(GenericTreeNode node) {
        if (node == null) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;

        for (GenericTreeNode temp: node.children) {
            max = Math.max(max, max(temp));
        }

        return Math.max(node.data, max);
    }
    public static int height(GenericTreeNode node) {
        if (node == null) return 0;

        int max = -1;
        for (GenericTreeNode temp: node.children) {
            max = Math.max(max, height(temp));
        }

        return max + 1;

    }
}
