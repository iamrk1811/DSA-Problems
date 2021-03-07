package questions.Graph;

import java.util.ArrayList;

public class IsGraphConnected {
    public boolean solve(ArrayList<Edge>[] graph, int source) {
        boolean[] visited = new boolean[graph.length];

        ArrayList<ArrayList<Integer>> components = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            ArrayList<Integer> component = new ArrayList<>();
            if (!visited[i]) {
                getComponent(graph, i, visited, component);
                components.add(component);
                if (components.size() > 1) return false;
            }
        }
        if (components.size() == 1) return true;
        return false;
    }
    private void getComponent(ArrayList<Edge>[] graph, int source, boolean[] visited, ArrayList<Integer> component) {
        visited[source] = true;

        component.add(source);

        for (Edge edge : graph[source]) {
            if (!visited[edge.neighbour]) {
                getComponent(graph, edge.neighbour, visited, component);
            }
        }
    }
}
