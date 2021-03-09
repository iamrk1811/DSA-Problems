package questions.Graph;

import java.awt.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumWireRequiredToConnect {
    static class Pair implements Comparable<Pair> {
        int source;
        int through;
        int weights;

        public Pair(int source, int through, int weights) {
            this.source = source;
            this.through = through;
            this.weights = weights;
        }
        @Override
        public int compareTo(Pair obj) {
            return this.weights - obj.weights;
        }
    }

    public void find(ArrayList<Edge>[] graph, int source) {
        boolean[] visited = new boolean[graph.length];

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Pair(source, Integer.MIN_VALUE, 0));

        while (!priorityQueue.isEmpty()) {
            Pair pair = priorityQueue.remove();

            if (visited[pair.source]) {
                continue;
            } else {
                visited[pair.source] = true;

                if (pair.through != Integer.MIN_VALUE)
                    System.out.println("Destination : " + pair.source + " Through : " + pair.through + " Weight : " + pair.weights);

                for (Edge edge : graph[pair.source])
                    if (!visited[edge.neighbour])
                        priorityQueue.add(new Pair(edge.neighbour, pair.source, edge.weight));

            }
        }
    }
}
