package questions.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
class PairWithTime {
    int source;
    int time;
    public PairWithTime(int source, int time) {
        this.source = source;
        this.time = time;
    }
}
public class SpreadOfInfection {
    public int spread(ArrayList<Edge>[] graph, int source, int time) {
        Queue<PairWithTime> queue = new ArrayDeque<>();
        queue.add(new PairWithTime(source, 1));
        boolean[] visited = new boolean[graph.length];
        int countInfected = 0;
        while (!queue.isEmpty()) {
            PairWithTime pair = queue.remove();

            if (visited[pair.source]) {
                 continue;
            } else {
                if (pair.time > time)
                    break;
                visited[pair.source] = true;
                countInfected++;
                for (Edge edge : graph[pair.source])
                    if (!visited[edge.neighbour])
                        queue.add(new PairWithTime(edge.neighbour, pair.time + 1));
            }
        }
        return countInfected;
    }
}
