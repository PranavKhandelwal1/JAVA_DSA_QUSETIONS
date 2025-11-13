package Trees;

import java.util.*;

public class BinaryTreeNode {

    private Node root; // root node of the tree
    

    private static class Node {

        protected int data; // value of the node
        protected Node leftNode; // left child node
        protected Node rightNode; // right child node
        protected int size; // size of the subtree rooted at this node

        Node(int data) {
            this.data = data;
            this.size = 1;
        }
    }

    // Binary tree Insert Node (interactive)
    public void insert(Scanner scanner) {
        System.out.println("Insert root Node data: ");
        scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        root = new Node(data);

        insertRec(root, scanner);

    }

    private Node insertRec(Node node, Scanner scanner) {

        System.out.println("Insert it left of "  + node.data +" (true or false) :");
        boolean isLeft = scanner.nextBoolean();
        if (isLeft) {
            System.out.println("Insert left child data of " + node.data + "(Int Value) : ");
            int data = scanner.nextInt();
            node.leftNode = new Node(data);
            node.size++;
            insertRec(node.leftNode, scanner);
        }
        System.out.println("Insert it right of " + node.data +" (true or false):");
        boolean isRight = scanner.nextBoolean();
        if (isRight) {
            System.out.println("Insert right child data of " + node.data + "(Int Value) : ");
            int data = scanner.nextInt();
            node.rightNode = new Node(data);
            node.size++;
            insertRec(node.rightNode, scanner);
        }
        return node;
    }

    private int size(Node node) {
        return node == null ? 0 : node.size;
    }

    public void displayTree() {
        displayTree(root, 0);
    }

    private void displayTree(Node node, int level) {
        if (node == null) {
            return;
        }
        displayTree(node.rightNode, level + 1);
        System.out.println(" ".repeat(level * 4) + node.data);
        displayTree(node.leftNode, level + 1);
    }

    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode();
        Scanner scanner = new Scanner(System.in);
        tree.insert(scanner);
        tree.displayTree();
        
    }
}
