package questions.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
class PairWithPath {
    int source;
    String path;
    public PairWithPath(int source, String path) {
        this.source = source;
        this.path = path;
    }
}
public class BreadthFirstTraversal {
    public void BFS(ArrayList<Edge>[] graph, int source) {
        boolean[] visited = new boolean[graph.length];

        Queue<PairWithPath> queue = new ArrayDeque<>();
        queue.add(new PairWithPath(source, source + ""));

        while (!queue.isEmpty()) {
//            Remove
            PairWithPath pair = queue.remove();

//            Mark*
            if (visited[pair.source]) {
            } else {
                visited[pair.source] = true;
//                Work
                System.out.println(pair.source + "@" + pair.path);
//                Add*
                for (Edge edge : graph[pair.source]) {
                    if (!visited[edge.neighbour])
                        queue.add(new PairWithPath(edge.neighbour, pair.path + edge.neighbour));
                }

            }
        }
    }
}
