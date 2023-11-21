package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testAddVertex() {
        Graph graph = new Graph();
        Object vertexA = graph.addVertex("A");

        assertNotNull(vertexA);
        assertEquals("A", vertexA.toString());
    }

    @Test
    public void testAddEdge() {
        Graph graph = new Graph();
        Object vertexA = graph.addVertex("A");
        Object vertexB = graph.addVertex("B");

        graph.addEdge(vertexA, vertexB, 2);

        assertEquals(1, graph.getNeighbors(vertexA).size());
        assertEquals(1, graph.getNeighbors(vertexB).size());
    }

    @Test
    public void testGetVertices() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        assertEquals(3, graph.getVertices().size());
    }

    @Test
    public void testGetNeighbors() {
        Graph graph = new Graph();
        Object vertexA = graph.addVertex("A");
        Object vertexB = graph.addVertex("B");

        graph.addEdge(vertexA, vertexB, 2);

        assertEquals(1, graph.getNeighbors(vertexA).size());
        assertEquals(1, graph.getNeighbors(vertexB).size());
    }

    @Test
    public void testSize() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        assertEquals(3, graph.size());
    }

    @Test
    public void testSingleVertexAndEdge() {
        Graph graph = new Graph();
        Object vertexA = graph.addVertex("A");

        assertEquals(1, graph.size());
        assertEquals(0, graph.getNeighbors(vertexA).size());
    }
}
