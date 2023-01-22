package datastructure;

class BinaryTreeNode {
    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }
}
public class BinaryTreeExample {
    public static void main(String[] args) {
        // Create the root node of the binary tree
        BinaryTreeNode root = new BinaryTreeNode(1);

        // Add left and right child nodes
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);

        // Add grandchild nodes
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);

        // Print the values of the nodes in the binary tree
        System.out.println("Root value: " + root.value);
        System.out.println("Left child value: " + root.left.value);
        System.out.println("Right child value: " + root.right.value);
        System.out.println("Left grandchild value: " + root.left.left.value);
        System.out.println("Right grandchild value: " + root.left.right.value);
    }
}