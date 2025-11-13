package Trees;

import java.util.Scanner;

public class inOrderTraversals {

    public static void main(String[] args) {
        // LEFT -> NODE -> RIGHT
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(4);
        tree.insert(8);
        tree.insert(6);
        tree.insert(9);
        tree.insert(7);
        tree.insert(10);
        tree.displayTree();
        tree.inorder(); // 1 2 3 4 5 6 7 8 9 10
    }
}
