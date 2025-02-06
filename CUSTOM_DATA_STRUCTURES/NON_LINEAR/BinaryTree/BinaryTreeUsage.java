package CUSTOM_DATA_STRUCTURES.NON_LINEAR.BinaryTree;

public class BinaryTreeUsage {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.println("inorder traversal: ");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("preorder traversal: ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("postorder traversal: ");
        tree.postOrder(tree.root);
    }
}
