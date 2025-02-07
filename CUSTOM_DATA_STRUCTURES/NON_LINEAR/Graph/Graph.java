package CUSTOM_DATA_STRUCTURES.NON_LINEAR.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
    private final int numVertices;
    private List<Set<Integer>> adjacencyList;
    private boolean isDirected;

    public Graph(int numVertices, boolean isDirected) {
        this.numVertices = numVertices;
        this.isDirected = isDirected;
        this.adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            this.adjacencyList.add(new HashSet<>());
        }
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public void addEdge(int source, int destination) {
        this.validateVertex(source);
        this.validateVertex(destination);

        this.adjacencyList.get(source).add(destination);

        if (!this.isDirected) {
            // Add reverse edge
            this.adjacencyList.get(destination).add(source);
        }
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public boolean hasEdge(int source, int destination) {
        this.validateVertex(source);
        this.validateVertex(destination);

        return this.adjacencyList.get(source).contains(destination);
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public void removeEdge(int source, int destination) {
        this.validateVertex(source);
        this.validateVertex(destination);

        this.adjacencyList.get(source).remove(destination);

        if (!this.isDirected) {
            // Remove reverse edge if it's undirected graph
            this.adjacencyList.get(destination).remove(source);
        }
    }

    /* Get all neighbors of a vertex */
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public Set<Integer> getNeighbors(int vertex) {
        this.validateVertex(vertex);

        return this.adjacencyList.get(vertex);
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    private void validateVertex(int vertex) {
        if (vertex < 0 || vertex >= this.numVertices) {
            throw new IllegalArgumentException("Invalid vertex: " + vertex);
        }
    }

    /*
        Time Complexity: O(V + E)
        Space Complexity: O(V)
    */
    public void bfs(int startVertex) {
        this.validateVertex(startVertex);

        boolean[] visited = new boolean[this.numVertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : this.adjacencyList.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    /*
        Time Complexity: O(V + E)
        Space Complexity: O(V)
    */
    public void dfs(int startVertex) {
        this.validateVertex(startVertex);
        boolean[] visited = new boolean[this.numVertices];
        this.dfsUTIL(startVertex, visited);
        System.out.println();
    }

    /*
        Time Complexity: O(V + E)
        Space Complexity: O(V)
    */
    private void dfsUTIL(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int neighbor : this.adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                this.dfsUTIL(neighbor, visited);
            }
        }
    }

    /*
        Time Complexity: O(V + E)
        Space Complexity: O(1)
    */
    public void printGraph() {
        for (int i = 0; i < this.numVertices; i++) {
            System.out.print(i + ": ");
            for (int neighbor : this.adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
