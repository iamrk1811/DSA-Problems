package questions.Tree.GenericTree;

import java.util.Collections;

public class Mirror {
    public GenericTreeNode solve(GenericTreeNode node) {
        for (GenericTreeNode temp: node.children)
            solve(temp);

        Collections.reverse(node.children);
        return node;
    }
}
