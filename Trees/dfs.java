package Trees;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class dfs {
    public static void main(String[] args) {
        // Create a sample tree:
        //        4
        //       / \
        //      2   5
        //     / \
        //    1   3

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.print("Inorder Traversal: ");
        inorderIterative(root);  // Output: 1 2 3 4 5
    }

    public static void inorderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null && !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.println(curr.val+" ");
            curr = curr.right;
            
        }
    }
}
