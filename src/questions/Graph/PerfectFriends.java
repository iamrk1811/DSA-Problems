package questions.Graph;

import java.util.ArrayList;

public class PerfectFriends {
    public int count(ArrayList<EdgeWithoutWeight>[] graph) {
        int pairsCount = 0;
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();

        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            ArrayList<Integer> component = new ArrayList<>();
            if (!visited[i]) {
                getComponents(graph, i, visited, component);
                components.add(component);

            }
        }
        for (int i = 0; i < components.size(); i++) {
            for (int j = i + 1; j < components.size(); j++) {
                int count = components.get(i).size() * components.get(j).size();
                pairsCount += count;
            }
        }
        return pairsCount;
    }
    private void getComponents(ArrayList<EdgeWithoutWeight>[] graph, int source, boolean[] visited, ArrayList<Integer> component) {

        visited[source] = true;

        component.add(source);

        for (EdgeWithoutWeight edge : graph[source]) {
            if (!visited[edge.neighbour]) {
                getComponents(graph, edge.neighbour, visited, component);
            }
        }
    }
}
