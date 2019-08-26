package code401challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {




    @Test
    public void preOrderTest() {
        BinaryTree<Integer> test = new BinaryTree<>();
        test.root = new Node<Integer>(1,
                new Node<Integer>(2,
                        new Node<Integer>(3),
                        new Node<Integer>(4)),
                new Node<Integer>(5));

        ArrayList<Integer> arr = test.preOrder(test.root);
        assertTrue(arr.toString().equals("[1, 2, 3, 4, 5]"));
        System.out.println("preOrder: " + arr);
//        ArrayList<Integer> arr2 = test.preOrder(test.root);
//        System.out.println(arr2);
    }

    @Test
    public void inOrderTest() {
        BinaryTree<Integer> test1 = new BinaryTree<>();
        test1.root = new Node<Integer>(1,
                new Node<Integer>(2,
                        new Node<Integer>(3),
                        new Node<Integer>(4)),
                new Node<Integer>(5));

        ArrayList<Integer> arr = test1.inOrder(test1.root);
        System.out.println("inOrder: " + arr);
        assertTrue(arr.toString().equals("[3, 2, 4, 1, 5]"));
    }

    @Test
    public void postOrderTest() {
        BinaryTree<Integer> test2 = new BinaryTree<>();
        test2.root = new Node<Integer>(1,
                new Node<Integer>(2,
                        new Node<Integer>(3),
                        new Node<Integer>(4)),
                new Node<Integer>(5));

        ArrayList<Integer> arr = test2.postOrder(test2.root);
        System.out.println("postOrder: " + arr);
        assertTrue(arr.toString().equals("[3, 4, 2, 5, 1]"));
    }
}