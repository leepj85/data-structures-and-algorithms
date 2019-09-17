package code401challenges.treeintersection;

import code401challenges.tree.BinarySearchTree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void tree_intersection() {
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.add(150);
        bst1.add(100);
        bst1.add(250);
        bst1.add(75);
        bst1.add(160);
        bst1.add(200);
        bst1.add(350);
        bst1.add(125);
        bst1.add(175);
        bst1.add(300);
        bst1.add(500);
        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.add(42);
        bst2.add(100);
        bst2.add(600);
        bst2.add(15);
        bst2.add(160);
        bst2.add(200);
        bst2.add(350);
        bst2.add(125);
        bst2.add(175);
        bst2.add(4);
        bst2.add(500);
//        System.out.println(bst1.inOrder(bst1.root));
//        System.out.println(bst2.inOrder(bst2.root));
//        System.out.println(TreeIntersection.tree_intersection(bst1, bst2));

        ArrayList<Integer> result = new ArrayList<>();
        result.add(100);
        result.add(125);
        result.add(160);
        result.add(175);
        result.add(200);
        result.add(350);
        result.add(500);

        assertEquals(result.toString(), TreeIntersection.tree_intersection(bst1, bst2).toString());




    }
}