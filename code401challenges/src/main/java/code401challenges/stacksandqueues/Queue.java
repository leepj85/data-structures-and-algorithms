package code401challenges.stacksandqueues;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;

    public void enqueue(T value) {
        Node<T> newNode = new Node(value);
        if(this.back == null){
            this.front = newNode;
            this.back = newNode;
        }
        else {
            this.back.setNextNode(newNode);
            this.back = newNode;
        }
    }

    public T dequeue() {
        if (this.front == null) {
            throw new NullPointerException("Cannot dequeue an empty Queue");
        }
        Node<T> currentFront = this.front;
        T value = currentFront.getValue();
        this.front = currentFront.getNextNode();
        return value;
    }

    public T peek() {
        if (this.front == null) {
            throw new NullPointerException("Cannot peek an empty Queue");
        }
        return this.front.getValue();
    }

    public String toString() {
        Node<T> current = this.front;
        String results = "Front -->";
        while (current != null){
            results += " " + current.getValue() + " -->";
            current = current.getNextNode();
        }
        return results + " Back";
    }
}
