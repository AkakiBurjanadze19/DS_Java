package CUSTOM_DATA_STRUCTURES.NON_LINEAR.BinarySearchTree;

public class BinarySearchTree {
    private BinarySearchTreeNode root;

    public void insert(int data) {
        this.root = this.insertRec(this.root, data);
    }

    private BinarySearchTreeNode insertRec(BinarySearchTreeNode root, int data) {
        if (root == null) {
            return new BinarySearchTreeNode(data);
        }

        if (data < root.data) {
            root.left = this.insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = this.insertRec(root.right, data);
        }

        return root;
    }

    public void delete(int data) {
        this.root = this.deleteRec(this.root, data);
    }

    private BinarySearchTreeNode deleteRec(BinarySearchTreeNode root, int data) {
        if (root == null) return null;

        if (data < root.data) {
            root.left = this.deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = this.deleteRec(root.right, data);
        } else {
            // Node with one child or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.data = this.minValue(root.right);
            root.right = this.deleteRec(root.right, root.data);
        }

        return root;
    }

    private int minValue(BinarySearchTreeNode root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }

        return min;
    }

    public boolean search(int data) {
        return this.searchRec(this.root, data);
    }

    private boolean searchRec(BinarySearchTreeNode root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        return (data < root.data) ? this.searchRec(root.left, data) : this.searchRec(root.right, data);
    }

    public void inOrder() {
        this.inOrderRec(this.root);
    }

    /* left->root->right */
    private void inOrderRec(BinarySearchTreeNode root) {
        if (root != null) {
            this.inOrderRec(root.left);
            System.out.println("data: " + root.data);
            this.inOrderRec(root.right);
        }
    }

    public void preOrder() {
        this.preOrderRec(this.root);
    }

    /* root->left->right */
    private void preOrderRec(BinarySearchTreeNode root) {
        if (root != null) {
            System.out.println("data: " + root.data);
            this.preOrderRec(root.left);
            this.preOrderRec(root.right);
        }
    }

    public void postOrder() {
        this.postOrderRec(this.root);
    }

    /* left->right->root */
    private void postOrderRec(BinarySearchTreeNode root) {
        if (root != null) {
            this.postOrderRec(root.left);
            this.postOrderRec(root.right);
            System.out.println("data: " + root.data);
        }
    }
}
