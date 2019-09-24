package code401challenges.graph;

import java.util.*;

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

    public List<Node> breadthFirstTraversal(Node node) {
        Set<Node> visitedNodes = new HashSet<>();
        List<Node> results = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        visitedNodes.add(node);
        queue.add(node);
        results.add(node);

        while (queue.size() != 0)
        {
            node = queue.poll();

            if(!visitedNodes.contains(node)) {
                results.add(node);
            }
            visitedNodes.add(node);

            vertices.get(node).forEach( neighbor -> {
                if(!visitedNodes.contains(neighbor))  queue.add(neighbor);
            });
        }
        return results;
    }

    public static String getEdge(Node[] cityList, Graph graph) {
        int sumCost = 0;
        String results = "False, $";

        Set graphCities = graph.getNodes();

        for(int i = 0; i < cityList.length - 1; i++) {
            int weight = 0;

            if(!graph.getNeighbors(cityList[i]).contains(cityList[i + 1])) {
                return results + "0";
            } else {
                Set<Edge> toEdges = cityList[i].edges;
                for(Edge edge : toEdges) {
                    if (cityList[i].edges.contains(edge) &&
                            (edge.a.equals(cityList[i]) && edge.b.equals(cityList[i + 1])) ||
                            (edge.a.equals(cityList[i + 1]) && edge.b.equals(cityList[i]))) {
                        weight = edge.getWeight();
                    }
                }
                sumCost += weight;
            }
        }
        return "True, $" + sumCost;
    }


}
