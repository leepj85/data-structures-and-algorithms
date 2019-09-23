package code401challenges.graph;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<Integer> graphTest = new Graph<>();


    @Test
    public void addNode() {
        graphTest.addNode(1);
        assertEquals(1, graphTest.size());
    }

    @Test
    public void addEdge() {
        Node node1 = graphTest.addNode(1);
        Node node2 = graphTest.addNode(2);
        graphTest.addEdge(node1, node2, 100 );
//        System.out.println(graphTest.size());

        assertEquals("[Edge: 1 <--> 2\n" +
                " Weight: 100]", node1.edges.toString());
    }

    @Test
    public void getNodes() {
        Node node1 = graphTest.addNode(1);
        Set<Node> results = graphTest.getNodes();
        assertEquals("[" + node1.data + "]", results.toString());
    }

    @Test
    public void getNeighbors() {
        Node node1 = graphTest.addNode(1);
        Node node2 = graphTest.addNode(2);
        graphTest.addEdge(node1, node2, 100 );
        Set<Node> results = graphTest.getNeighbors(node1);
//        System.out.println(results);
//        System.out.println(node2.data);
        assertTrue(results.contains(node2));
    }

    @Test
    public void size() {
        graphTest.addNode(1);
        assertTrue(graphTest.size() == 1);
    }
}