package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> {

    public Node<T> root;
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


    public void breadthFirst(){
        Queue<Node> queue = new LinkedList();
        if (this.root == null) {
            System.out.println("Tree is empty");
        }
        else {
            queue.add(this.root);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                System.out.println(currentNode.value);
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);}
            }
        }
    }

    public int findMaximumValue() {
        int maxValue = (int) root.value;
        Queue<Node> queue = new LinkedList();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if ((int)current.value > maxValue){
                maxValue = (int)current.value;
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }

        }
        return maxValue;
    }
}
