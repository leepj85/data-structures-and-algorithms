package code401challenges.linkedlist;

public class LinkedList<T> {

    private Node<T> head;

    public static LinkedList mergeLists(LinkedList one, LinkedList two) {
        if (one == null || two == null) {
            throw new IllegalArgumentException();
        }

        Node list1 = one.head;
        Node list2 = two.head;
        Node list1NextNode = null;
        Node list2NextNode = null;

        while (list1 != null && list2 != null) {
            list1NextNode = list1.getNextNode();
            list2NextNode = list2.getNextNode();

            list1.setNextNode(list2);
            list2.setNextNode(list1NextNode);

            list1 = list1NextNode;
            list2 = list2NextNode;
        }
        return one;
    }

    public T kthFromEnd(int k) {
        Node current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        if(length < k || k < 0) {
            return null;
        }
        current = head;
        for (int i = 1; i < length - k; i++) {
            current = current.getNextNode();
        }
        return (T) current.getValue();
    }

    public void insert(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        Node current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    public void insertBefore(T value, T newVal) {
        Node<T> newNode = new Node<>(newVal);
        Node current = head;
        if (head == null) {
            head = newNode;
        } else if (current.getValue().equals(value)) {
            newNode.setNextNode(current);
            head = newNode;
        } else {
            while (!current.getNextNode().getValue().equals(value)) {
                current = current.getNextNode();
//                if ( current == null) {
//                }
            }
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
        }
    }

    public void insertAfter(T value, T newVal) {
        Node<T> newNode = new Node<>(newVal) ;
        Node current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (!current.getValue().equals(value)) {
                current = current.getNextNode();
            }
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
        }

    }

    public boolean includes(T value) {
        Node<T> current = head;
        boolean result = false;
        while (current != null) {
            if (current.getValue().equals(value)) {
                result = true;
                break;
            }
            current = current.getNextNode();
        }
        return result;
    }

    public String toString() {
        String results = "head -->";
        Node<T> current = head;
        while (current != null) {
            results += " " + current.getValue() + " -->";
            current = current.getNextNode();
        }
        return results + " end";
    }
}
