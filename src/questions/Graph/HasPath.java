package questions.Graph;

import java.util.ArrayList;

public class HasPath {
    public boolean hasPath(ArrayList<Edge>[] graph, int source, int destination, boolean[] visited) {
        if (source == destination)
            return true;

        visited[source] = true;

        for (Edge edge : graph[source]) {
            if (!visited[edge.neighbour]) {
                boolean isExist = hasPath(graph, edge.neighbour, destination, visited);
                if (isExist)
                    return true;
            }
        }
        return false;
    }
}
