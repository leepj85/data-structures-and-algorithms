package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree {

    public Tree fizzBuzzTree(Tree tree) {
        fizzBuzzTreeRec(tree.root);
        return tree;
    }

    private void fizzBuzzTreeRec(Node root) {
        Node currentNode = root;
        if (currentNode != null) {
            int nodeValue = (int) currentNode.value;
            if (nodeValue % 3 == 0 && nodeValue % 5 == 0) {
                currentNode.value = "FizzBuzz";
            } else if(nodeValue % 3 == 0 ) {
                currentNode.value = "Fizz";
            } else if (nodeValue % 5 == 0) {
                currentNode.value = "Buzz";
            }
            if (currentNode.left != null) {
                fizzBuzzTreeRec(currentNode.left);
            }
            if(currentNode.right != null) {
                fizzBuzzTreeRec(currentNode.right);
            }
        } else {
            return;
        }
    }
}
