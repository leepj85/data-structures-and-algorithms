# Graphs
Implement a Graph & Implement a breadth-first traversal on a graph.

## Challenge
* The graph should be represented as an adjacency list, with the following methods (as shown in API list below).
* Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

## API
  1. AddNode()
      * Adds a new node to the graph
      * Takes in the value of that node
      * Returns the added node
  2. AddEdge()
      * Adds a new edge between two nodes in the graph
      * Include the ability to have a “weight”
      * Takes in the two nodes to be connected by the edge
      * Both nodes should already be in the Graph
  3. GetNodes()
      * Returns all of the nodes in the graph as a collection (set, list, or similar)
  4. GetNeighbors()
      * Returns a collection of nodes connected to the given node
      * Takes in a given node
      * Include the weight of the connection in the returned collection
  5. Size()
      * Returns the total number of nodes in the graph
     
## Solution
[Source Code - Graph](https://github.com/leepj85/data-structures-and-algorithms/tree/master/code401challenges/src/main/java/code401challenges/graph)

[Test Code - Graph](https://github.com/leepj85/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/graph/GraphTest.java)

## Whiteboard
![Graph Whiteboard](https://github.com/leepj85/data-structures-and-algorithms/blob/master/code401challenges/assets/breadth-first-traversal-graph.png)

---

## Challenge
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?

## Solution
[Source Code - Graph](https://github.com/leepj85/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/graph/Graph.java)

[Test Code - Graph](https://github.com/leepj85/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/graph/GraphTest.java)

## Solution
![Graph Get Edge](https://github.com/leepj85/data-structures-and-algorithms/blob/master/code401challenges/assets/graph_get_edge.png)
