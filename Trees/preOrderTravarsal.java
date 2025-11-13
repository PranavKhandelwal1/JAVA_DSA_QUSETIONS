package Trees;

public class preOrderTravarsal {

    public static void main(String[] args) {

        // NODE -> LEFT -> RIGHT
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
        tree.preorder(); // 5 2 1 3 4 8 6 7 9 10
    }
}
