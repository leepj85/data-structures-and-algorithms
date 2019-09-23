package code401challenges.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph<E> {
    private Map<Node, Set<Node>> vertices;

    public Graph() {
        vertices =  new HashMap<>();
    }

    public Node addNode(E value) {
        Node newNode;
        if(value != null) {
            newNode = new Node<>(value);
            vertices.put(newNode, new HashSet<>());
            return newNode;
        }
        return null;
    }

    public void addEdge(Node a, Node b, int weight) {
        if(vertices.containsKey(a) && vertices.containsKey(b)) {
            Edge newEdge = new Edge<>(a, b, weight);
            vertices.get(a).add(b);
            a.edges.add(newEdge);
            vertices.put(a, vertices.get(a));

            vertices.get(b).add(a);
            b.edges.add(newEdge);
            vertices.put(b, vertices.get(b));
        }
    }

    public Set<Node> getNodes() {
        if(vertices != null) {
            return vertices.keySet();
        }
        return null;
    }

    public Set<Node> getNeighbors(Node node) {
        if(vertices.containsKey(node)) {
            return vertices.get(node);
        }
        return null;
    }

    public int size() {
        return this.vertices.size();
    }

}
