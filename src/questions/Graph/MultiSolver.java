package questions.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
class Pair implements Comparable<Pair> {
    int weight;
    String path;
    public Pair(int weight, String path) {
        this.weight = weight;
        this.path = path;
    }
    @Override
    public int compareTo(Pair obj) {
        return this.weight - obj.weight;
    }
}
public class MultiSolver {

    public int totalWeight = 0;
    public String smallestPath = "";
    public int smallestWeight = Integer.MAX_VALUE;
    public String largestPath = "";
    public int largestWeight = Integer.MIN_VALUE;
    public int ceil = Integer.MAX_VALUE;
    public String ceilPath = "";
    public int floor = Integer.MIN_VALUE;
    public String floorPath = "";

    public PriorityQueue<Pair> pq = new PriorityQueue<>();

    public void solve(ArrayList<Edge>[] graph, int source, int destination, int target, int totalWeight, int k, boolean[] visited, String ans) {
        if (source == destination) {
            if (totalWeight < smallestWeight) {
                this.smallestPath = ans;
                this.smallestWeight = totalWeight;
            }

            if (totalWeight > largestWeight) {
                this.largestPath = ans;
                this.largestWeight = totalWeight;
            }

            if (totalWeight > target && totalWeight < this.ceil) {
                this.ceilPath = ans;
                this.ceil = totalWeight;
            }

            if (totalWeight < target && totalWeight > this.floor) {
                this.floorPath = ans;
                this.floor = totalWeight;
            }

            if (pq.size() < k) {
                pq.add(new Pair(totalWeight, ans));
            } else {
                if (!pq.isEmpty() && pq.peek().weight < totalWeight)
                    pq.remove();
                pq.add(new Pair(totalWeight, ans));
            }
        }

        visited[source] = true;

        for (Edge edge : graph[source]) {
            if (!visited[edge.neighbour])
                solve(graph, edge.neighbour, destination, target, totalWeight + edge.weight, k, visited, ans + edge.neighbour);
        }

        visited[source] = false;
    }
    public void printAllData() {
        System.out.println(smallestPath + " @ " + smallestWeight);
        System.out.println(largestPath + " @ " + largestWeight);
        System.out.println(ceilPath + " @ " + ceil);
        System.out.println(floorPath + " @ " + floor);
        System.out.println(pq.peek().path + " @ " + pq.peek().weight);
    }
}
