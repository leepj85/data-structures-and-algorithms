package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTreeTest() {
        FizzBuzzTree fbTree = new FizzBuzzTree();
        Tree<Object> tree = new Tree<>();
        tree.root = new Node<Object>(1,
                new Node<Object>(15,
                        new Node<Object>(3),
                        new Node<Object>(4)),
                new Node<Object>(5));
        fbTree.fizzBuzzTree(tree);
        ArrayList<Object> arr = tree.preOrder(tree.root);
//        System.out.println(arr);
        assertTrue(arr.toString().equals("[1, FizzBuzz, Fizz, 4, Buzz]"));
    }
}