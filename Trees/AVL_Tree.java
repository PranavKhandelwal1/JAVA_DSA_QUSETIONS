package Trees;

public class AVL_Tree {

    public class treeNode {

        int value;
        int height;
        protected treeNode left;
        protected treeNode right;

        public treeNode() {
        }

        public treeNode(int data) {
            this.value = data;
        }

        public treeNode(int data, treeNode left, treeNode right) {
            this.value = data;
            this.left = left;
            this.right = right;
        }

    }
    private treeNode root;

    public AVL_Tree() {
    }

    public void  insert(int data) {
        root = insertion(root, data);
    }

    private treeNode insertion(treeNode root, int data) {
        if (root == null) {
            return new treeNode(data);
        }
        if (data < root.value) {
            root.left = insertion(root.left, data);
        }
            if (data > root.value) {
            root.right = insertion(root.right, data);
        }
        root.height = Math.max(Height(root.left), Height(root.right)) + 1;
        return rotate(root);
    }

    private treeNode rotate(treeNode root) {
        int balance = Height(root.left) - Height(root.right);

        // Left heavy
        if (balance > 1) {
            if (Height(root.left.left) >= Height(root.left.right)) {
                return rightRotate(root); // Left-Left
            } else {
                root.left = leftRotate(root.left); // Left-Right
                return rightRotate(root);
            }
        }

        // Right heavy
        if (balance < -1) {
            if (Height(root.right.left) - Height(root.right.right) < 0) {
                return leftRotate(root); // Right-Right
            } else {
                root.right = rightRotate(root.right); // Right-Left
                return leftRotate(root);
            }
        }
        return root;
    }

    private treeNode leftRotate(treeNode c) {
        treeNode p = c.right;
        treeNode temp = p.left;

        p.left = c;
        c.right = temp;

        c.height = Math.max(Height(c.left), Height(c.right)) + 1;
        p.height = Math.max(Height(p.left), Height(p.right)) + 1;

        return p;
    }

    private treeNode rightRotate(treeNode p) {
        treeNode c = p.left;
        treeNode temp = c.right;
        c.right = p;
        p.left = temp;
        c.height = Math.max(Height(c.left), Height(c.right)) + 1;
        p.height = Math.max(Height(p.left), Height(p.right)) + 1;
        return c;
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(treeNode node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    //tree Height
    public int height() {
        return Height(root);
    }

    public int Height(treeNode root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static void main(String[] args) {
        AVL_Tree tree = new AVL_Tree();
        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }
        // tree.display();
        System.out.println(tree.height());
    }
}
