package questions.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

// Based on pepcoding
public class CreateGraph {
    public ArrayList<Edge>[] create() throws IOException {
//        custom input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfVertices = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int numberOfEdges = Integer.parseInt(st.nextToken());

        ArrayList<Edge>[] graph = new ArrayList[numberOfVertices];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < numberOfEdges; i++) {
            st = new StringTokenizer(br.readLine());

            int source = Integer.parseInt(st.nextToken());
            int neighbour = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            graph[source].add(new Edge(source, neighbour, weight));
            graph[neighbour].add(new Edge(neighbour, source, weight));
        }
        System.out.println();
        for (ArrayList<Edge> list : graph) {
            for (Edge edge : list) {
                System.out.println(edge.source + " -> " + edge.neighbour);
            }
        }
        return graph;
    }
}
