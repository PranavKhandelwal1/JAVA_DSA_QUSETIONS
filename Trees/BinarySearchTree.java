package Trees;

import java.util.Scanner;
import javax.xml.crypto.Data;
import org.w3c.dom.Node;

public class BinarySearchTree {

    private treeNode root;

    public class treeNode {

        private int data;
        private treeNode left;
        private treeNode right;
        private int height;

        treeNode(int data) {
            this.data = data;
            this.height = 1;
            this.left = null;
            this.right = null;
        }
    }

    // Insertion inn BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private treeNode insertRec(treeNode root, int data) {
        if (root == null) {
            return new treeNode(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        return root;
    }

    // check is tree balanced?
    public boolean balanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(treeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    // Search in BST
    public boolean search(int data) {
        return Search(root, data);
    }

    private boolean Search(treeNode root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return Search(root.left, data);
        }
        return Search(root.right, data);
    }

    // Deletion in BST
    // method 2 to insert nodes in BST
    // public void insert(Scanner scanner){
    //     System.out.println("Insert root value (Int value): ");
    //     int data = scanner.nextInt();
    //     root = new treeNode(data);
    //     insertRec(root, scanner);
    // }
    // private void  insertRec(treeNode root, Scanner scanner){
    //     System.out.println("Do you want to insert left child nodes of (true or false): " + root.data);
    //     boolean choice = scanner.nextBoolean();
    //     if(choice){
    //         System.out.println("Enter the data for the node left: " + root.data);
    //         int data = scanner.nextInt();
    //         if(data < root.data){
    //             root.left = new treeNode(data);
    //             insertRec(root.left, scanner);
    //         }
    //     }
    //     System.out.println("Do you want to insert right child nodes of (true or false): " + root.data);
    //     boolean choice2 = scanner.nextBoolean();
    //     if(choice2){
    //         System.out.println("Enter the data for the node right: " + root.data);
    //         int data = scanner.nextInt();
    //         if(data > root.data){
    //             root.right = new treeNode(data);
    //             insertRec(root.right, scanner);
    //         }
    //     }
    // }
    public static int height(treeNode node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void displayTree() {
        displayTree(root, 0);
    }

    private void displayTree(treeNode node, int level) {
        if (node == null) {
            return;
        }
        displayTree(node.right, level + 1);
        System.out.println(" ".repeat(level * 4) + node.data);
        displayTree(node.left, level + 1);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(treeNode node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.data);
        display(node.left, "Left child of " + node.data + " : ");
        display(node.right, "Right child of " + node.data + " : ");
    }

    // if we have given sorted arr {1 2 3 4 5 6 7 8 9 10}
    public void treeBalencing(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        // treeNode newNode = new treeNode(arr[mid]);
        this.insert(arr[mid]);
        treeBalencing(arr, start, mid - 1);
        treeBalencing(arr, mid + 1, end);
    }

    // Pre-order BST NODE ->LEFT ->RIGHT
    public void preorder() {
        preorderTravarsal(root);
    }

    private void preorderTravarsal(treeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTravarsal(root.left);
        preorderTravarsal(root.right);
    }

    // In-order BST  LEFT ->NODE ->RIGHT
    public void inorder() {
        inorderTravarsal(root);
    }

    private treeNode inorderTravarsal(treeNode root) {
        if (root == null) {
            return root;
        }
        inorderTravarsal(root.left);
        System.out.print(root.data + " ");
        inorderTravarsal(root.right);
    return root;
    }
    // Post-order BST

    public void postorder() {
        postorderTravarsal(root);
    }

    private void postorderTravarsal(treeNode root) {
        if (root == null) {
            return;
        }
        postorderTravarsal(root.left);
        postorderTravarsal(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // int[] arr = {100, 50, 20, 60, 30, 10, 40, 70, 80, 110, 200};
        // for (int i = 0; i < 10; i++) {
        //     bst.insert(arr[i]);
        // }
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // bst.treeBalencing(arr, 0, arr.length - 1);
        // bst.display();
        // bst.displayTree();
    }
}
