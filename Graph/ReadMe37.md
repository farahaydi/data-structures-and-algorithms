# Code Challenge: Class 37
The businessTrip method calculates the total cost of a business trip based on a given graph of cities and their direct flight costs. 
It takes an array of city names, representing the trip itinerary, and returns the total cost.
If a direct flight is unavailable between any consecutive pair of cities or if a city is not in the graph, the method returns null.
This function ensures modularity and reusability in the context of graph-based city connections.

## Whiteboard Process
[wb](img_2.png)

## Approach & Efficiency
Approach & Efficiency
businessTrip Method:
Time Complexity: O(n)

The method iterates through the cities in the input array once, where 'n' is the number of cities in the array.
Each iteration involves constant time operations (graph lookups and additions).
Space Complexity: O(1)

The method uses a constant amount of space for variables (totalCost, currentCity, nextCity).
The graph data structure does not contribute to space complexity as it is an input parameter.
## Solution
```
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

```