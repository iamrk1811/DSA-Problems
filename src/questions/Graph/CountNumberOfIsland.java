package questions.Graph;

public class CountNumberOfIsland {
    public int count(int[][] arr) {
//        0 -> island
//        1 -> water
        boolean[][] visited = new boolean[arr.length][arr[0].length];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!visited[i][j] && arr[i][j] == 0) {
                    getVirtualComponent(arr, i, j, visited);
                    count++;
                }
             }
        }
        return count;
    }
    private void getVirtualComponent(int[][] graph, int row, int col, boolean[][] visited) {
        if (row < 0 || col < 0 || row >= graph.length || col >= graph[0].length
            || visited[row][col] || graph[row][col] == 1) {
            return;
        }

        visited[row][col] = true;

        getVirtualComponent(graph, row - 1, col, visited);
        getVirtualComponent(graph, row + 1, col, visited);
        getVirtualComponent(graph, row, col - 1, visited);
        getVirtualComponent(graph, row, col + 1, visited);
    }
}
