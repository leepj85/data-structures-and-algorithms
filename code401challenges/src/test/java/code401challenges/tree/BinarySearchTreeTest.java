package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void addTest() {
        BinarySearchTree test = new BinarySearchTree();
        test.add(100);
        test.add(20);
        test.add(10);
        test.add(30);
        test.add(500);
        test.add(40);
        System.out.println(test.inOrder(test.root));
    }

    @Test
    public void containsTest() {
        BinarySearchTree test = new BinarySearchTree();
        test.add(100);
        test.add(20);
        test.add(10);
        test.add(30);
        test.add(500);
        test.add(40);
        assertTrue(test.contains(100));
        assertTrue(test.contains(40));
        assertTrue(test.contains(500));

        assertTrue(!test.contains(200));
        assertTrue(!test.contains(100000));

    }
}