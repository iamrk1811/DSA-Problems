package questions.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

class PairWithLevel {
    int source;
    int level;
    public PairWithLevel (int source, int level) {
        this.source = source;
        this.level = level;
    }
}
public class IsGraphBipartite {
    public boolean solve(ArrayList<Edge>[] graph) {

        int[] visited = new int[graph.length];
        Arrays.fill(visited, -1);

        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == -1) {
                boolean isGraphBipartite = check(graph, i, visited);
                if (!isGraphBipartite)
                    return false;
            }
        }

        return true;
    }
    private boolean check(ArrayList<Edge>[] graph, int source, int[] visited) {
        Queue<PairWithLevel> queue = new ArrayDeque<>();
        queue.add(new PairWithLevel(source, 0));

        while (!queue.isEmpty()) {
            PairWithLevel pair = queue.remove();

            if (visited[pair.source] != -1) {
                if (pair.level != visited[pair.source])
                    return false;
            } else {
                visited[pair.source] = pair.level;
                for (Edge edge : graph[pair.source]) {
                    if (visited[edge.neighbour] == -1)
                        queue.add(new PairWithLevel(edge.neighbour, pair.level + 1));
                }
            }

        }
        return true;
    }
}
