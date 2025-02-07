package CUSTOM_DATA_STRUCTURES.NON_LINEAR.Graph;

public class GraphUsage {
    public static void main(String[] args) {
        Graph graph = new Graph(5, false);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Adjacency list: ");
        graph.printGraph();

        System.out.println("BFS from vertex 0: ");
        graph.bfs(0);

        System.out.println("DFS from vertex 0: ");
        graph.dfs(0);
    }
}
