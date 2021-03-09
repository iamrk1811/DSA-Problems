package questions.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class IsGraphCyclic {
    public boolean solve(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                boolean res = check(graph, i, visited);
                if (res)
                    return true;
            }
        }
        return false;
    }

    private boolean check(ArrayList<Edge>[] graph, int source, boolean[] visited) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);

        while (!queue.isEmpty()) {
//            remove
            int src = queue.remove();
//            mark*
            if (visited[src]) return true;
            else {
                visited[src] = true;
//                add
                for (Edge edge : graph[src])
                    if (!visited[edge.neighbour])
                        queue.add(edge.neighbour);
            }
        }
        return false;
    }
}
