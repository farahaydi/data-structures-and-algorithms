# Code Challenge: Class 38
The depth-first traversal algorithm visits nodes in a graph, starting from a specified node, exploring as far as possible along each branch before backtracking. The order of visitation follows a pre-order traversal.

## Whiteboard Process
[wc](img_3.png)
## Approach & Efficiency
To implement the Depth First Search (DFS) algorithm in the Graph class, I used a recursive approach. The algorithm starts at a specified node, marks it as visited, and recursively explores its neighbors, ensuring that each visited node is added to the result collection in pre-order depth-first traversal order.

Time Complexity:
The time complexity of the depth-first traversal algorithm is O(V + E), where V is the number of vertices (nodes) and E is the number of edges in the graph.

Space Complexity:
The space complexity is O(V), where V is the number of vertices. This is due to the space required for the recursive call stack during the traversal.

## Solution
```
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
```
