package questions.Graph;

import java.util.ArrayList;

public class GetConnected {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Edge>[] graph, int source) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            ArrayList<Integer> component = new ArrayList<>();
            if (!visited[i]) {
                resolve(graph, i, visited, component);
//                assert res != null;
                res.add(component);
            }
        }
        return res;
    }
    private void resolve(ArrayList<Edge>[] graph, int source, boolean[] visited, ArrayList<Integer> comp) {
        visited[source] = true;

        comp.add(source);

        for (Edge edge : graph[source]) {
            if (!visited[edge.neighbour]) {
                resolve(graph, edge.neighbour, visited, comp);
            }
        }
    }
}
