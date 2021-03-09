package questions.Graph;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShortestPathInWeights {
    static class Pair implements Comparable<Pair> {
        int source;
        String path;
        int weight;

        public Pair(int source, String path, int weight) {
            this.source = source;
            this.path = path;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair obj) {
            return this.weight - obj.weight;
        }
    }

    public void find(ArrayList<Edge>[] graph, int source) {

        boolean[] visited = new boolean[graph.length];

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Pair(source, source + "", 0));

        while (!priorityQueue.isEmpty()) {
            Pair pair = priorityQueue.remove();

            if (visited[pair.source]) {
                continue;
            } else {
                visited[pair.source] = true;

                System.out.println("Destination : " + pair.source + " Path : " + pair.path + " Weight : " + pair.weight);

                for (Edge edge : graph[pair.source])
                    if (!visited[edge.neighbour])
                        priorityQueue.add(new Pair(edge.neighbour, pair.path + edge.neighbour, pair.weight + edge.weight));
            }
        }
    }
}
