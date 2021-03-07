package questions.Graph;

import java.util.ArrayList;

public class PrintAllPath {
    public void print(ArrayList<Edge>[] graph, int source, int destination, boolean[] visited, String ans) {
        if (source == destination) {
            System.out.println(ans + source);
            return;
        }
        visited[source] = true;

        for (Edge edge : graph[source]) {
            if (!visited[edge.neighbour]) {
                print(graph, edge.neighbour, destination, visited, ans + source);
            }
        }

        visited[source] = false;
    }
}
