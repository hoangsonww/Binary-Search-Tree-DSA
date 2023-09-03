/**
 * A class that represents a Node in the Binary Search Tree, which has its key (data), its left and right child pointers.
 * It is declared to be available for any classes in the package to use only, so it does not have any access modifiers.
 * @author David Nguyen
 * @since 03/08/2023
 */
class Node {

    // A field that represents the key (data) of the node
    protected int key;

    // A field that stores the left child pointer of the node (points to the left child of the node)
    protected Node left;

    // A field that stores the right child pointer of the node (points to the right child of the node)
    protected Node right;

    /**
     * A constructor that creates a node instance that takes in a key (data) as an integer.
     * When a node is created, its left and right pointer should initially be null. Additionally, the key of the node
     * should also be assigned the parsed-in key value
     * @param key The key (data) of the node to be created
     */
    protected Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

}