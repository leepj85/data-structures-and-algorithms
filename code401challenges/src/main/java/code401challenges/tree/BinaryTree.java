package code401challenges.tree;

import java.util.ArrayList;

public class BinaryTree<T> {

    Node<T> root;
    ArrayList<T> arr = new ArrayList<>();

    // Root, Left, Right
    public ArrayList<T> preOrder(Node node) {
//        if (!arr.isEmpty()) {
//            arr.clear();
//        }
        arr.add((T)node.value);
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }
        return arr;
    }

    // Left, Root, Right
    public ArrayList<T> inOrder(Node node) {
//        arr.clear();
        if (node.left != null) {
            inOrder(node.left);
        }
        arr.add((T)node.value);
        if (node.right != null) {
            inOrder(node.right);
        }
        return arr;
    }

    // Left, Right, Root
    public ArrayList<T> postOrder(Node node) {
        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        arr.add((T)node.value);
        return arr;
    }
}
