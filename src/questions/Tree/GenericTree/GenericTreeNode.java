package questions.Tree.GenericTree;

import java.util.ArrayList;

public class GenericTreeNode {
    int data;
    ArrayList<GenericTreeNode> children = new ArrayList<>();

    public GenericTreeNode(int data) {
        this.data = data;
    }
}
