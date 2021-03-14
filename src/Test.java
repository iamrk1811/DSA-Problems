import questions.LinkedList.Node;

import java.lang.reflect.Array;
import java.util.*;
public class Test {

    public static Node test(Node node) {
        if (node == null) return null;

        Node res = test(node.next);

        if (node.next != null)
            node.next.next = node;
        else
            return node;

        return res;
    }

}