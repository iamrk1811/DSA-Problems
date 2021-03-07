package questions.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CreateGraphWithoutWeight {
    public ArrayList<EdgeWithoutWeight>[] create() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfVertices = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int numberOfEdges = Integer.parseInt(st.nextToken());

        ArrayList<EdgeWithoutWeight>[] graph = new ArrayList[numberOfVertices];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<EdgeWithoutWeight>();
        }

        for (int i = 0; i < numberOfEdges; i++) {
            st = new StringTokenizer(br.readLine());
            int source = Integer.parseInt(st.nextToken());
            int neighbour = Integer.parseInt(st.nextToken());

            graph[source].add(new EdgeWithoutWeight(source, neighbour));
            graph[neighbour].add(new EdgeWithoutWeight(neighbour, source));
        }
        return graph;
    }
}
