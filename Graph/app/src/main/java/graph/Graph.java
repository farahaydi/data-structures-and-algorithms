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
        public Collection<Object> breadthFirst(Object startNode) {
            if (!vertices.containsKey(startNode)) {
                System.out.println("Start node not found in the graph.");
                return Collections.emptyList();
            }
    
            Set<Object> visited = new HashSet<>();
            List<Object> result = new ArrayList<>();
            Queue<Object> queue = new LinkedList<>();
    
            queue.add(startNode);
            visited.add(startNode);
    
            while (!queue.isEmpty()) {
                Object current = queue.poll();
                result.add(current);
    
                for (Edge neighbor : vertices.get(current)) {
                    if (!visited.contains(neighbor.getVertex())) {
                        queue.add(neighbor.getVertex());
                        visited.add(neighbor.getVertex());
                    }
                }
            }
    
            System.out.println("Breadth-first traversal result: " + result);
            return result;
        }
    
        public Integer businessTrip(String[] cities) {
            int totalCost = 0;
    
            for (int i = 0; i < cities.length - 1; i++) {
                String currentCity = cities[i];
                String nextCity = cities[i + 1];
    
                if (!vertices.containsKey(currentCity) || !vertices.containsKey(nextCity)) {
                    return null;
                }
    
                boolean directFlightExists = false;
                for (Edge neighbor : vertices.get(currentCity)) {
                    if (neighbor.getVertex().equals(nextCity)) {
                        directFlightExists = true;
                        totalCost += neighbor.getWeight();
                        break;
                    }
                }
    
                if (!directFlightExists) {
                    return null;
                }
            }
    
            return totalCost;
        }



        public Collection<Object> depthFirst(Object startNode) {
            if (!vertices.containsKey(startNode)) {
                System.out.println("Start node not found in the graph.");
                return Collections.emptyList();
            }

            Set<Object> visited = new HashSet<>();
            List<Object> result = new ArrayList<>();

            depthFirstTraversal(startNode, visited, result);

            System.out.println("Depth-first traversal result: " + result);
            return result;
        }

        private void depthFirstTraversal(Object current, Set<Object> visited, List<Object> result) {
            visited.add(current);
            result.add(current);

            for (Edge neighbor : vertices.get(current)) {
                if (!visited.contains(neighbor.getVertex())) {
                    depthFirstTraversal(neighbor.getVertex(), visited, result);
                }
            }
        }



    }