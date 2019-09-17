package code401challenges.treeintersection;

import code401challenges.tree.BinarySearchTree;
import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {

    public static ArrayList<Integer> tree_intersection(BinarySearchTree tree1, BinarySearchTree tree2) {
        HashMap<Integer, Integer> map = new HashMap<>(1024);
        ArrayList<Integer> duplicateList = new ArrayList<>();

        ArrayList<Integer> list1 = tree1.inOrder(tree1.root);
        ArrayList<Integer> list2 = tree2.inOrder(tree2.root);

        ArrayList<Integer> list = new ArrayList<>();

        for (int element : list1) {
            map.put(element, element);
        }

        for (int element : list2) {
            if (map.containsKey(element)) {
                duplicateList.add(element);
            }
        }
        return duplicateList;
    }
}
