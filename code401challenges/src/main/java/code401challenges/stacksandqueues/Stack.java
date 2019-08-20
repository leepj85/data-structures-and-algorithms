package code401challenges.stacksandqueues;

public class Stack<T> {

    protected Node<T> top;

    public void push(T value) {
        Node<T> newNode = new Node<T>(value, this.top);

        if(this.top == null) {
            this.top = newNode;
        } else {
            newNode.setNextNode(this.top);
            this.top = newNode;
        }
    }

    public T peek() {
        if (top == null) {
            throw new NullPointerException(("Cannot peek an empty Stack"));
        }
        return this.top.getValue();
    }

    public T pop() {
        if (top == null) {
            throw new NullPointerException("Cannot pop an empty Stack");
        } else {
            Node<T> node = this.top;
            this.top = node.getNextNode();
            T value = node.getValue();
            return value;
        }
    }

    public String toString() {
        Node<T> current = this.top;
        String results = "Top -->";
        while (current != null){
            results += " " + current.getValue() + " -->";
            current = current.getNextNode();
        }
        return results + " Bottom";
    }
}
