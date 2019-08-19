package code401challenges.stacksandqueues;

public class Node<T> {

    private T value;
    private Node<T> nextNode;

    public Node(T value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(T value) {
        this(value, null);
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }
}