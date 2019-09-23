package code401challenges.graph;

import java.util.HashSet;
import java.util.Set;

public class Node<E> {
    E data;
    Set<Edge> edges;

    Node(E value) {
        this.data = value;
        edges = new HashSet<>();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
