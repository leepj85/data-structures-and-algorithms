package code401challenges.graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<Integer> graphTest = new Graph<>();
    Graph<String> graphString = new Graph<>();
    Graph<String> edgeGraph = new Graph<>();
    Graph<String> breadthGraph = new Graph<>();


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

    @Test
    public void breadthFirstTraversal() {
        Node node1 = graphString.addNode("Pandora");
        Node node2 = graphString.addNode("Arendelle");
        Node node3 = graphString.addNode("Metroville");
        Node node4 = graphString.addNode("Monstropolis");
        Node node5 = graphString.addNode("Narnia");
        Node node6 = graphString.addNode("Naboo");

        graphString.addEdge(node1, node2, 0);
        graphString.addEdge(node2, node3, 0);
        graphString.addEdge(node2, node4, 0);
        graphString.addEdge(node3, node4, 0);
        graphString.addEdge(node3, node5, 0);
        graphString.addEdge(node3, node6, 0);
        graphString.addEdge(node5, node6, 0);

        List<Node> results = graphString.breadthFirstTraversal(node1);
        assertEquals(6, results.size());

    }

    @Test
    public void getEdge() {


        Node metroville = edgeGraph.addNode("Metroville");
        Node pandora = edgeGraph.addNode("Pandora");
        Node arendelle = edgeGraph.addNode("Arendelle");
        Node monstropolis = edgeGraph.addNode("Monstropolis");
        Node naboo = edgeGraph.addNode("Naboo");
        Node narnia = edgeGraph.addNode("Narnia");

        edgeGraph.addEdge(metroville, pandora, 82);
        edgeGraph.addEdge(metroville, arendelle, 99);
        edgeGraph.addEdge(metroville, monstropolis, 105);
        edgeGraph.addEdge(metroville, naboo, 26);
        edgeGraph.addEdge(metroville, narnia, 37);
        edgeGraph.addEdge(pandora, arendelle, 150);
        edgeGraph.addEdge(arendelle, monstropolis, 42);
        edgeGraph.addEdge(monstropolis, naboo, 73);
        edgeGraph.addEdge(narnia, naboo, 250);


        Node[] test = new Node[]{metroville, pandora};
        Node[] test1 = new Node[]{arendelle, monstropolis, naboo};
        Node[] test2 = new Node[]{naboo, pandora};
        Node[] test3 = new Node[]{narnia, arendelle, naboo};
        assertEquals("True, $82", Graph.getEdge(test, edgeGraph));
        assertEquals("True, $115", Graph.getEdge(test1, edgeGraph));
        assertEquals("False, $0", Graph.getEdge(test2, edgeGraph));
        assertEquals("False, $0", Graph.getEdge(test3, edgeGraph));
    }

    @Test
    public void depthFirstTraversal() {
        Node nodeA = breadthGraph.addNode("A");
        Node nodeB = breadthGraph.addNode("B");
        Node nodeC = breadthGraph.addNode("C");
        Node nodeD = breadthGraph.addNode("D");
        Node nodeE = breadthGraph.addNode("E");
        Node nodeF = breadthGraph.addNode("F");
        Node nodeG = breadthGraph.addNode("G");
        Node nodeH = breadthGraph.addNode("H");

        breadthGraph.addEdge(nodeA, nodeB, 0);
        breadthGraph.addEdge(nodeB, nodeC, 0);
        breadthGraph.addEdge(nodeC, nodeG, 0);
        breadthGraph.addEdge(nodeA, nodeD, 0);
        breadthGraph.addEdge(nodeD, nodeE, 0);
        breadthGraph.addEdge(nodeD, nodeF, 0);
        breadthGraph.addEdge(nodeF, nodeH, 0);
        breadthGraph.addEdge(nodeD, nodeH, 0);

        List<Node> results = breadthGraph.depthFirstTraversal(nodeA);
        assertEquals("[A, B, C, G, D, E, H, F]", results.toString());
    }
}