package code401challenges.graph;

public class Edge<E> {
    int weight;
    E a;
    E b;

    public Edge(E a, E b, int weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge: " + a + " <--> " + b + "\n Weight: " + weight;
    }
}
