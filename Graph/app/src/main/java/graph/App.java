
package graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class App {

    public static void main(String[] args) {
        Graph graph1 = new Graph();

        Object vertexA = graph1.addVertex("A");
        Object vertexB = graph1.addVertex("B");
        Object vertexC = graph1.addVertex("C");
        Object vertexD = graph1.addVertex("D");
        Object vertexE = graph1.addVertex("E");

        graph1.addEdge(vertexA, vertexB, 2);
        graph1.addEdge(vertexA, vertexC, 1);
        graph1.addEdge(vertexB, vertexC, 3);
        graph1.addEdge(vertexB, vertexD, 4);
        graph1.addEdge(vertexC, vertexE, 5);

        System.out.println("Vertices: " + graph1.getVertices());

        System.out.println("Neighbors of A: " + graph1.getNeighbors(vertexA));

        System.out.println("Size of the graph: " + graph1.size());

        System.out.println("Breadth-first traversal:");
        graph1.breadthFirst(vertexA);



        Graph graph = new Graph();

        graph.addVertex("Metroville");
        graph.addVertex("Pandora");
        graph.addEdge("Metroville", "Pandora", 82);

        graph.addVertex("Arendelle");
        graph.addVertex("New Monstropolis");
        graph.addVertex("Naboo");
        graph.addEdge("Arendelle", "New Monstropolis", 45);
        graph.addEdge("Arendelle", "Naboo", 73);
        graph.addEdge("New Monstropolis", "Naboo", 90);

        graph.addVertex("Narnia");
        graph.addEdge("Narnia", "Arendelle", 37);
        graph.addEdge("Narnia", "Naboo", 130);

        String[] trip1 = {"Metroville", "Pandora"};
        Integer cost1 = graph.businessTrip(trip1);
        System.out.println("Input: " + Arrays.toString(trip1) + "\tOutput: $" + cost1);

        String[] trip2 = {"Arendelle", "New Monstropolis", "Naboo"};
        Integer cost2 = graph.businessTrip(trip2);
        System.out.println("Input: " + Arrays.toString(trip2) + "\tOutput: $" + cost2);

        String[] trip3 = {"Naboo", "Pandora"};
        Integer cost3 = graph.businessTrip(trip3);
        System.out.println("Input: " + Arrays.toString(trip3) + "\tOutput: $" + cost3);

        String[] trip4 = {"Narnia", "Arendelle", "Naboo"};
        Integer cost4 = graph.businessTrip(trip4);
        System.out.println("Input: " + Arrays.toString(trip4) + "\tOutput: $" + cost4);


    Graph graphx = new Graph();

    // Adding vertices
        graphx.addVertex("A");
        graphx.addVertex("B");
        graphx.addVertex("C");
        graphx.addVertex("D");
        graphx.addVertex("E");
        graphx.addVertex("F");
        graphx.addVertex("G");
        graphx.addVertex("H");

        graphx.addEdge("A", "B", 1);
        graphx.addEdge("A", "C", 1);
        graphx.addEdge("B", "D", 1);
        graphx.addEdge("C", "G", 1);
        graphx.addEdge("D", "E", 1);
        graphx.addEdge("E", "H", 1);
        graphx.addEdge("E", "F", 1);

        graphx.depthFirst("A");
}
}

