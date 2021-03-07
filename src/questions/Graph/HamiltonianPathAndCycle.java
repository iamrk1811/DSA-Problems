package questions.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class HamiltonianPathAndCycle {
    public void solve(ArrayList<Edge>[] graph, int source) {
        HashSet<Integer> visited = new HashSet<>();
        printPath(graph, source, visited, source + "", source);

    }

    private void printPath(ArrayList<Edge>[] graph, int source, HashSet<Integer> visited, String ans, int originalSource) {
//        Base case is when all vertices visited
        if (graph.length - 1 == visited.size()) {
            System.out.print(ans);

//            check for hamiltonian cycle
            boolean flag = false;
            for (Edge edge : graph[originalSource]) {
                if (edge.neighbour == source) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
            System.out.println();
        }
        visited.add(source);
        for (Edge edge : graph[source]) {
            if (!visited.contains(edge.neighbour)) {
                printPath(graph, edge.neighbour, visited, ans + edge.neighbour, originalSource);
            }
        }
        visited.remove(source);
    }
}
