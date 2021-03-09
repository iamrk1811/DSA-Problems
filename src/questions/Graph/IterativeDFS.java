package questions.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeDFS {
    static class Pair {
        int source;
        String path;

        public Pair(int source, String path) {
            this.source = source;
            this.path = path;
        }
    }

    public void solve(ArrayList<Edge>[] graph, int source) {
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(source, source + ""));

        boolean[] visited = new boolean[graph.length];

        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            if (visited[pair.source])
                continue;
            else {
                visited[pair.source] = true;
                System.out.println(pair.source + "@" + pair.path);
                for (Edge edge : graph[pair.source])
                    if (!visited[edge.neighbour])
                        stack.push(new Pair(edge.neighbour, pair.path + edge.neighbour));
            }
        }
    }
}
