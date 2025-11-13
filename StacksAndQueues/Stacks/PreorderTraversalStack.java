package StacksAndQueues.Stacks;
import java.util.*;

public class PreorderTraversalStack {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void preorderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            System.out.print(curr.val+" ");

            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
        }
    }
    public static void main(String[] args) {
        /*// Sample tree:
        //      4
        //     / \
        //    2   5
        //   / \
        //  1   3
        */
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.print("Preorder Traversal: ");
        preorderIterative(root); // Output: 4 2 1 3 5
    }

    
}
