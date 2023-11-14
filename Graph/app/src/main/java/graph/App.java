
package graph;

public class App {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Object vertexA = graph.addVertex("A");
        Object vertexB = graph.addVertex("B");
        Object vertexC = graph.addVertex("C");

        graph.addEdge(vertexA, vertexB, 2);
        graph.addEdge(vertexA, vertexC, 1);
        graph.addEdge(vertexB, vertexC, 3);

        System.out.println("Vertices: " + graph.getVertices());
        System.out.println("Neighbors of A: " + graph.getNeighbors(vertexA));
        System.out.println("Size of the graph: " + graph.size());
    }
}
