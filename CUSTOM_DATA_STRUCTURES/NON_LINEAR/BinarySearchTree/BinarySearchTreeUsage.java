package CUSTOM_DATA_STRUCTURES.NON_LINEAR.BinarySearchTree;

public class BinarySearchTreeUsage {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(25);
        tree.insert(3);
        tree.insert(22);

        System.out.println("22 exists: " + tree.search(22));
        System.out.println();

        System.out.println("inorder traversal: ");
        tree.inOrder();
        System.out.println();

        System.out.println("preorder traversal: ");
        tree.preOrder();
        System.out.println();

        System.out.println("postorder traversal: ");
        tree.postOrder();
    }
}
