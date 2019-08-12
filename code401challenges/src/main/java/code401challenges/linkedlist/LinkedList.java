package code401challenges.linkedlist;

public class LinkedList<T> {

    private Node head = null;

    public void insert(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    public boolean includes(T value) {
        Node current = head;
        boolean result = false;
        while (current != null) {
            if (current.value.equals(value)) {
                result = true;
                break;
            }
            current = current.next;
        }
        return result;
    }

    public String toString() {
        String results = "";
        Node current = head;
        while (current != null) {
            results += current.value + " ";
            current = current.next;
        }
        return results;
    }
}
