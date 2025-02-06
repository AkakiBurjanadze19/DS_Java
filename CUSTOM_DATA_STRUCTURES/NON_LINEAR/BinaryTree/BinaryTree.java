package CUSTOM_DATA_STRUCTURES.NON_LINEAR.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public BinaryTreeNode root;

    /* Insert a node using a level-order traversal (left to right) */
    public void insert(int data) {
        BinaryTreeNode newNode = new BinaryTreeNode(data);

        if (this.root == null) {
            this.root = newNode;
            return;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();

            // Insert at first available left/right child
            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = newNode;
                return;
            } else {
                queue.add(current.right);
            }
        }
    }

    /* left->root->right */
    public void inOrder(BinaryTreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println("data: " + node.data);
            inOrder(node.right);
        }
    }

    /* root->left->right */
    public void preOrder(BinaryTreeNode node) {
        if (node != null) {
            System.out.println("data: " + node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /* left->right->root */
    public void postOrder(BinaryTreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println("data: " + node.data);
        }
    }
}
