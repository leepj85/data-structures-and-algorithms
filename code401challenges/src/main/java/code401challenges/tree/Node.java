package code401challenges.tree;

public class Node<T> {

    public T value;
    public Node<T> left;
    public Node<T> right;

    public Node(T val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }

    public Node(T val, Node<T> left, Node<T> right) {
        this.value = val;
        this.left = left;
        this.right = right;
    }
}
