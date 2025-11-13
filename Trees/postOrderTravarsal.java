package Trees;

public class postOrderTravarsal {

    public static void main(String[] args) {

        // NODE -> RIGHT -> LEFT
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
        tree.postorder(); // 1 4 3 2 7 6 10 9 8 5
    }
}
