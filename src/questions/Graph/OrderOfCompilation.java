package questions.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class OrderOfCompilation {
    public void topologicalSort(ArrayList<EdgeWithoutWeight>[] graph) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i])
                sort(graph, i, visited, stack);
        }
        System.out.println(stack);
    }
    private void sort(ArrayList<EdgeWithoutWeight>[] graph, int source, boolean[] visited, Stack<Integer> stack) {
        visited[source] = true;
        for (EdgeWithoutWeight edge : graph[source]){
            if (!visited[edge.neighbour])
                sort(graph, edge.neighbour, visited, stack);
        }
        stack.push(source);
    }
}
