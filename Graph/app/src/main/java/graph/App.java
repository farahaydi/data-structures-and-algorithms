
package graph;

public class App {

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Adding vertices
        Object vertexA = graph.addVertex("A");
        Object vertexB = graph.addVertex("B");
        Object vertexC = graph.addVertex("C");
        Object vertexD = graph.addVertex("D");
        Object vertexE = graph.addVertex("E");

        // Adding edges
        graph.addEdge(vertexA, vertexB, 2);
        graph.addEdge(vertexA, vertexC, 1);
        graph.addEdge(vertexB, vertexC, 3);
        graph.addEdge(vertexB, vertexD, 4);
        graph.addEdge(vertexC, vertexE, 5);

        // Getting vertices
        System.out.println("Vertices: " + graph.getVertices());

        // Getting neighbors of a vertex
        System.out.println("Neighbors of A: " + graph.getNeighbors(vertexA));

        // Getting the size of the graph
        System.out.println("Size of the graph: " + graph.size());

        // Breadth-first traversal starting from vertexA
        System.out.println("Breadth-first traversal:");
        graph.breadthFirst(vertexA);
    }
}
