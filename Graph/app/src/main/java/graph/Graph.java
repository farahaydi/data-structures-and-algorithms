package graph;

import java.util.*;


public class Graph {
    private Map<Object, List<Edge>> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public Object addVertex(Object value) {
        if (!vertices.containsKey(value)) {
            vertices.put(value, new ArrayList<>());
            return value;
        }
        return null;
    }

    public void addEdge(Object vertex1, Object vertex2, int weight) {
        if (vertices.containsKey(vertex1) && vertices.containsKey(vertex2)) {
            vertices.get(vertex1).add(new Edge(vertex2, weight));
            vertices.get(vertex2).add(new Edge(vertex1, weight));
        }
    }

    public Collection<Object> getVertices() {
        return vertices.keySet();
    }

    public List<Edge> getNeighbors(Object vertex) {
        return vertices.getOrDefault(vertex, new ArrayList<>());
    }

    public int size() {
        return vertices.size();
    }

    private static class Edge {
        private Object vertex;
        private int weight;

        public Edge(Object vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        public Object getVertex() {
            return vertex;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "vertex=" + vertex +
                    ", weight=" + weight +
                    '}';
        }
    }
}