package code401challenges.tree;

public class BinarySearchTree extends Tree<Integer> {

    Node<Integer> root;

    public BinarySearchTree() {
        root = null;
    }

    //Reference: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
    //For: add and contains methods
    public void add(int value) {
        root = addRec(root, value);
    }

    private Node<Integer> addRec(Node<Integer> node, int value) {
        if (node == null) {
            node = new Node<Integer>(value);
        }
        if (value < node.value) {
            node.left = addRec(node.left, value);
        } else if (value > node.value) {
            node.right = addRec(node.right, value);
        }
        return node;
    }

    public Boolean contains(int value) {
        return containsRec(root, value);
    }

    private boolean containsRec(Node<Integer> node, int value) {
        if (node == null) {
            return false;
        } else if (node.value == value) {
            return true;
        }
        if  (node.value > value) {
            return containsRec(node.left, value);
        }
        return containsRec(node.right, value);

    }

}
