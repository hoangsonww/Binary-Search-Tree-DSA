/**
 * A class that represents a Binary Search Tree and its associated methods.
 * @author David Nguyen
 * @since 03/08/2023
 */
public class BinarySearchTree {

    // A field that represents the root of the Binary Search Tree
    private Node root;

    // A field that represents the number of nodes visited when traversing the binary search tree (used for the delete method)
    private int numNodesVisited;

                                                    // CONSTRUCTORS: //

    /**
     * A constructor that creates a Binary Search Tree that takes no input (A B.S.T. can be created in two main ways, either
     * with an input assigned as it root when it's created, or with no inputs and the tree will be created as an empty tree.)
     * A Binary Search Tree can be created in three ways in order to allow for the flexibility of creating the tree.
     *
     */
    public BinarySearchTree() {
        this.root = null;
        // The number of nodes visited field will always be reset upon the creation of the new tree
        this.numNodesVisited = 0;
    }

    /**
     * A constructor that creates a Binary Search Tree that takes one int input and assigns it as the tree's root by
     * creating a node with the parsed-in, given key and making it the root node of the B.S.T.
     * (A B.S.T. can be created in two main ways, either with an input assigned as it root when it's created,
     * or with no inputs and the tree will be created as an empty tree.)
     * A Binary Search Tree can be created in three ways in order to allow for the flexibility of creating the tree.
     *
     * @param root A root for the tree to be created, parsed in as an integer and a new node will be automatically created
     *             for that root.
     */
    public BinarySearchTree(int root) {
        this.root = new Node(root);
        // The number of nodes visited field will always be reset upon the creation of the new tree
        this.numNodesVisited = 0;
    }

    /**
     * A constructor that creates a Binary Search Tree that takes one Node input and assigns it as the tree's root.
     * (A B.S.T. can be created in two main ways, either with an input assigned as it root when it's created,
     * or with no inputs and the tree will be created as an empty tree.)
     * A Binary Search Tree can be created in three ways in order to allow for the flexibility of creating the tree.
     *
     * @param root A root node for the tree to be created, parsed in as a created node
     */
    public BinarySearchTree(Node root) {
        this.root = root;
        // The number of nodes visited field will always be reset upon the creation of the new tree
        this.numNodesVisited = 0;
    }

                                                 // PRIMARY METHODS: //

    /**
     * A method that inserts the specified key into the Binary Search Tree by calling another helper, overloaded method
     * with the same name.
     *
     * @param key A key that will be inserted into the tree.
     */
    public void insert(int key) {
        insert(this.root, key);
    }

    /**
     * A method that creates a tree from a given, parsed-in array of integers. Any existing tree will be overwritten.
     *
     * @param values any given array from which a tree will be created from
     */
    public void createTree(int[] values) {
        // Now creates a new root for the new tree with the first value of the given array and override the current root
        Node newRoot = new Node(values[0]);
        // Assign the new root to be the newly-created node
        this.root = newRoot;
        /*
         * A loop that passes every element of the given array into the tree using the insert() method above. It
         * will stop when the end of the array is reached.
         */
        for (int i = 1; i < values.length; i++) {
            insert(newRoot, values[i]);
        }
        /*
         * Now, print out a confirmation that a new tree is created and print out the new tree using three different types
         * of traversal. This is done to help with the testing and behavior verification part of this method.
         */
        System.out.println("A new tree has been successfully created from the given array:");
        System.out.println("Inorder traversal of the new tree: ");
        inorderRec(newRoot);
        System.out.println();
        System.out.println("Preorder traversal of the new tree: ");
        preorderRec(newRoot);
        System.out.println();
        System.out.println("Postorder traversal of the new tree: ");
        postorderRec(newRoot);
        /*
         * When these statements to print the tree are executed, it means that the tree is created successfully from the
         * given array, and the programmer can use the information printed on the screen to verify the elements of the tree.
         */
    }

    /**
     * A method that searches for a specific key in the Binary Search Tree by calling another helper, overloaded method
     * with the same name.
     * (I have implemented this function before the assignment was changed and therefore, my helper method still returns
     * a node with the specified key.) Please forgive me for this mistake.
     * @param key A key in the B.S.T. to search for.
     * @return A node that is found with the given key, or may return null if no node with such key is found
     */
    public boolean search(int key) {
        // A Node variable that will be assigned and store the result of the search() helper function
        Node searchResult = null;
        // A variable that stores the boolean variable true-false for returning
        boolean result = true;
        // Perform a search that returns a node with the specified key
        searchResult = search(this.root, key);
        // Checks if the returned node is null. If it is, it means that no nodes with such key is found, return false.
        if (searchResult == null) {
            result = false;
        }
        // Simply return this result variable, which can either be true or false
        return result;
    }

    /**
     * A method that deletes the node with the specified key from the Binary Search Tree by calling another helper,
     * overloaded method with the same name.
     *
     * @param key The key of the node that will be deleted from the tree.
     * @return The node that is the new root of the new tree after deletion.
     */
    public Node delete(int key) {
        // A Node variable that will be assigned and store the result of the helper function delete()
        Node newRoot = null;
        newRoot = delete(this.root, key);
        // Simply return this result variable
        return newRoot;
    }

    /**
     * A method that traverses the tree in inorder traversal using recursion and prints out all the nodes while traversing
     * by calling another helper, overloaded method with the same name.
     */
    public void inorderRec() {
        inorderRec(this.root);
    }

    /**
     * A method that traverses the tree in preorder traversal using recursion and prints out all the nodes while traversing
     * by calling another helper, overloaded method with the same name.
     */
    public void preorderRec() {
        preorderRec(this.root);
    }

    /**
     * A method that traverses the tree in postorder traversal using recursion and prints out all the nodes while traversing
     * by calling another helper, overloaded method with the same name.
     */
    public void postorderRec() {
        postorderRec(this.root);
    }

    /**
     * A method that finds the k-th-smallest node of the current tree with the given root by calling another helper,
     * overloaded method with the same name by implementing inorder traversal.
     *
     * @param k The value of how small the node to be found is in the tree (e.g. 2nd-smallest or 5th-smallest)
     * @return The node that is found given the k value input, or may return null if no such node is found.
     */
    public Node kthSmallest(int k) {
        // A Node variable that will be assigned and store the result of the helper function kthSmallestHelper2()
        Node kthSmallestNode = null;
        // A try-catch block to check if there is any exception thrown due to invalidity of input k
        try {
            kthSmallestNode = kthSmallestHelper2(this.root, k);
            // Simply return this variable as the result
            return kthSmallestNode;
        }
        // If an exception is caught, system should print a message saying that the entered k value is invalid
        catch (IllegalArgumentException e) {
            System.out.println("The entered k value is invalid! It is either smaller than 0 or greater than the number of nodes currently in the tree!");
            // Return null because the given k value is invalid and henceforth no kth-smallest node can be found with it
            return null;
        }
    }

                                                  // HELPER METHODS: //

    /**
     * A method that traverses and inserts a Node to a given Binary Search Tree with its root specified using recursion
     *
     * @param root The root of a B.S.T. in which a node will be added
     * @param key  The key (data) of the node to be inserted
     */
    private void insert(Node root, int key) {
        // A variable that stores the current node of the tree (i.e. current root of subtree) when traversing the tree
        Node traverseNode = root;
        // A variable that keeps track of the parent (previous) node of the current traversing node.
        Node parent = null;
        /*
         * The base case for recursion: the method should assign the current node of the tree that we are on the value
         * to be inserted, and then the method is stopped. This should only be done when the method has found the exact,
         * correct place in the tree to insert a node.
         */
        if (traverseNode == null) {
            // Assigns the key to be inserted as a new leaf node of the tree by creating a new node with the given key:
            traverseNode = new Node(key);
            this.root = traverseNode;
            // Stops the function by using the return keyword
            return;
        }
        /*
         * A while-loop that stops when the traverse node is null. It will traverse the B.S.T. to find the place where
         * the new node should be inserted by continuously assigning the traversing node to be its child node in either its
         * right or left subtree, as described below:
         */
        while (traverseNode != null) {
            // First, keeps track of the current parent of the traversing node:
            parent = traverseNode;
            // If the key to be inserted is smaller than the current traversing node's key, go to its left subtree
            if (key < traverseNode.key) {
                traverseNode = traverseNode.left;
            }
            // If the key to be inserted is greater than the current traversing node's key, go to its right subtree
            else if (key >= traverseNode.key) {
                traverseNode = traverseNode.right;
            }
            /* The loop will stop when the traversing node is null - i.e. it has reached the leaf of the tree where
             * the new node will be inserted. */
        }
        /*
         * Now that we have found where to insert our new node, we will compare the given key with the key of our current
         * parent. If that key is greater than the current parent's key, create a new node and assign it as the left child node
         * of the current parent.
         */
        if (key < parent.key) {
            parent.left = new Node(key);
        }
        /*
         * Otherwise, if the given key is greater than or equal to the current parent's key, assign the new node with
         * the given key to be the right child node of the current parent.
         */
        else if (key >= parent.key) {
            parent.right = new Node(key);
        }
    }

    /**
     * A method that searches for a node with the specific key in the given B.S.T. with the given root using recursion
     *
     * @param root The root of the binary search tree that will be searched
     * @param key  Any given key to be searched
     * @return The node is found to have the same key as the given input key. In the case that no node with such key is
     * found in the tree, the system will return the given root only, and prints out a confirmation that no such node with
     * given key is found in the tree.
     */
    private Node search(Node root, int key) {
        // A variable that keeps track of the current node (i.e. current root of subtree) used when traversing the tree
        Node traverseNode = root;
        /*
         * Now, if the traverse node is null, which means that we have traversed the entire tree and found no matching
         * node. Thus, only the given root will be returned and a message will be printed to the screen to confirm that
         * no such key is found in the tree.
         */
        if (traverseNode == null) {
            System.out.println("No Such Key or Element Exists in the Tree!");
            return null;
        }
        /*
         * The base case for the recursion method: It should stop and return the node found if the node that has the same
         * key as the given key is found
         */
        if (traverseNode.key == key) {
            return traverseNode;
        }
        /*
         * If the current traverse node's key is greater than the given key, traverse and search its left subtree as the
         * node to be found should now be in the traverse node's left subtree
         */
        if (key < traverseNode.key) {
            traverseNode = search(traverseNode.left, key);
        }
        /*
         * Otherwise, if the current traverse node's key is smaller than or equal to the given key, traverse and search
         * its right subtree as the node to be found should now be in the traverse node's right subtree
         */
        else if (key >= traverseNode.key) {
            traverseNode = search(traverseNode.right, key);
        }
        // At the end of the function, return the traversing node in order to stop the function and add a return statement
        return traverseNode;
    }

    /**
     * A method that will delete the node with the specific key in a B.S.T. and return te node that is deleted.
     *
     * @param root the root of the tree whose node is to be deleted
     * @param key  the key of the node to be found and deleted
     * @return the node that is the new root of the new tree after deletion
     */
    private Node delete(Node root, int key) {
        // A variable that stores and keeps track of the current traversing node (i.e. current root of subtree) while traversing the tree
        Node traverseNode = root;
        /*
         * In the base case of this method: return the current traversing node, as we have traversed the entire tree,
         * and we may or may not have found and deleted a node from the tree. This base case also works when the tree is empty,
         * as it will simply return the parsed-in root.
         */
        if (traverseNode == null) {
            return null;
        }
        /*
         * If the current traversing node's key is greater than the given key, traverse its left subtree as the node to
         * be found and deleted is likely in this subtree, using recursion.
         */
        if (traverseNode.key > key) {
            traverseNode.left = delete(traverseNode.left, key);
        }
        /*
         * If the current traversing node's key is smaller than the given key, traverse its right subtree as the node to
         * be found and deleted is likely in this subtree, using recursion.
         */
        else if (traverseNode.key < key) {
            traverseNode.right = delete(traverseNode.right, key);
        }
        /*
         * If the current traversing node's key is the same as the given key, which means that we have found the node to
         * be deleted. We will now look at three different cases, as described below:
         */
        else if (key == traverseNode.key) {
            /*
             * If the right child node of the current traversing node is null (which means that it has only 1 left child),
             * assign it to be its left child in order to delete it from the tree.
             */
            if (traverseNode.right == null) {
                // A temporary Node variable to store the current node to be deleted, just in case it gets mixed up
                Node temporaryNode = traverseNode;
                // Assigns the current root (i.e. the current traversal node) to be its left child
                traverseNode = traverseNode.left;
            }
            /*
             * If the left child node of the current traversing node is null (which means that it has only 1 right child),
             * assign it to be its right child in order to delete it from the tree.
             */
            else if (traverseNode.left == null) {
                // A temporary Node variable to store the current node to be deleted, just in case it gets mixed up
                Node temporaryNode = traverseNode;
                // Assigns the current root (i.e. the current traversal node) to be its right child
                traverseNode = traverseNode.right;
            }
            // Otherwise, if the node to be deleted is a leaf node (that has no children), simply delete it from the tree
            else if (traverseNode.left == null && traverseNode.right == null) {
                traverseNode = null;
            }
            /*
             * If the node to be deleted has two children, find the minimum key in its right subtree and replace its key
             * with the minimum key. Then traverse the current traversing node's right subtree to delete the minimum key
             * from the tree.
             */
            else if (traverseNode.left != null && traverseNode.right != null) {
                // A temporary Node variable to store the current node to be deleted, just in case it gets mixed up with other variables
                Node temporaryNode = traverseNode;
                // A variable that stores the minimum key in the current traverse node's right subtree
                Node minimum = findMinimumInSubTree(temporaryNode.right);
                // Replace the current node's key to be the minimum node's key in order to delete it from the tree
                traverseNode.key = minimum.key;
                // Delete the minimum node's key from the tree in order to avoid any duplications in the tree
                traverseNode.right = delete(traverseNode.right, minimum.key);
            }
        }
        // Return the current traverse node in order to stop the function
        return traverseNode;
    }

    /**
     * A helper function that helps find the minimum node in the current tree or subtree given its root, using recursion
     *
     * @param root The node of the tree that will be searched
     * @return The minimum node in the current tree or subtree given its root
     */
    private Node findMinimumInSubTree(Node root) {
        // A variable that stores and keeps track of the current traversing node (i.e. current root of subtree) while traversing the tree
        Node traverseNode = root;
        /*
         * The base case for the recursion: if the left child node of the current traversing node is null, return the
         * traversing node, as we have now found the smallest node in the current tree or subtree.
         */
        if (traverseNode.left == null) {
            return traverseNode;
        }
        /*
         * Otherwise, traverse the current node's left subtree in order to find the smallest node in it. Then, return
         * the current traversing node in order to stop the function.
         */
        else if (traverseNode.left != null) {
            traverseNode = findMinimumInSubTree(traverseNode.left);
            return traverseNode;
        }
        // Return the current traversal node
        return traverseNode;
    }

    /**
     * A method that traverses the tree in inorder traversal using recursion and prints out all the nodes while traversing
     *
     * @param root The root of the tree to be traversed
     */
    private void inorderRec(Node root) {
        // A variable that stores and keeps track of the current traversing node (i.e. current root of subtree) while traversing the tree
        Node traverseNode = root;
        /*
         * The base case for the recursion: the function will stop when the traverse node is null, or when the tree
         * is empty or when the tree has been completely, fully traversed.
         */
        if (traverseNode == null) {
            return;
        }
        // First, recursively traverse the left subtree of the current traversing node
        inorderRec(traverseNode.left);
        // Then, visit the current root & prints out the nodes as we traverse through the B.S.T.'s subtree
        System.out.print(traverseNode.key + " ");
        // Then, recursively traverse the right subtree of the current traversing node
        inorderRec(traverseNode.right);
    }

    /**
     * A method that traverses the tree in preorder traversal using recursion and prints out all the nodes while traversing
     *
     * @param root The root of the tree to be traversed
     */
    public void preorderRec(Node root) {
        // A variable that stores and keeps track of the current traversing node (i.e. current root of subtree) while traversing the tree
        Node traverseNode = root;
        /*
         * The base case for the recursion: the function will stop when the traverse node is null, or when the tree
         * is empty or when the tree has been completely, fully traversed.
         */
        if (traverseNode == null) {
            return;
        }
        // First, visit the current root & prints out the nodes of the tree as we traverse it
        System.out.print(traverseNode.key + " ");
        // Then, recursively traverse the left subtree of the current traversing node
        preorderRec(traverseNode.left);
        // Then, recursively traverse the right subtree of the current traversing node
        preorderRec(traverseNode.right);
    }

    /**
     * A method that traverses the tree in preorder traversal using recursion and prints out all the nodes while traversing
     *
     * @param root The root of the tree to be traversed
     */
    private void postorderRec(Node root) {
        // A variable that stores and keeps track of the current traversing node (i.e. current root of subtree) while traversing the tree
        Node traverseNode = root;
        /*
         * The base case for the recursion: the function will stop when the traverse node is null, or when the tree
         * is empty or when the tree has been completely, fully traversed.
         */
        if (traverseNode == null) {
            return;
        }
        // First, recursively traverse the left subtree of the current traversing node
        preorderRec(traverseNode.left);
        // Then, recursively traverse the right subtree of the current traversing node
        preorderRec(traverseNode.right);
        // Then, visit the current root & prints out the nodes of the tree as we traverse it
        System.out.print(traverseNode.key + " ");
    }

    /**
     * A method that helps find the k-th-smallest element/node in a given tree or subtree using recursion and inorder
     * traversal.
     *
     * @param root The root of the tree in which the k-th-smallest element will be found
     * @param k    the value of how small the node to be found is in the tree (e.g. 2nd-smallest or 5th-smallest)
     * @return the k-th-smallest element
     */
    private Node kthSmallestHelper1(Node root, int k) {
        // A variable that stores and keeps track of the current traversing node (i.e. current root of subtree) while traversing the tree
        Node traverseNode = root;
        // A node that keeps track of the k-th-smallest node
        Node kthSmallestNode = null;
        /*
         * Base case for the recursion: If the current traverse node is null, meaning that either we have traversed the
         * entire tree or when the tree is null
         */
        if (traverseNode == null) {
            return traverseNode;
        }
        // First, traverse the left subtree of the current node to perform inorder traversal
        kthSmallestNode = kthSmallestHelper1(traverseNode.left, k);
        /*
         * Whenever the k-th-smallest node variable is assigned a value (i.e. it is found), the method should stop and
         * return this variable.
         */
        if (kthSmallestNode != null) {
            return kthSmallestNode;
        }
        // Otherwise, increment the current number of nodes visited while traversing the tree by 1
        numNodesVisited = numNodesVisited + 1;
        /*
         * Check if the current number of nodes visited field is equal to the given k-value. If it is, return the current
         * traversing node. Otherwise, let the method continue as normal.
         */
        if (numNodesVisited == k) {
            // Assign the kth-smallest-node variable to be the current traversing node and return it
            kthSmallestNode = traverseNode;
            return kthSmallestNode;
        }
        /*
         * After completing traversing the current root's left subtree, we will now traverse its right subtree to complete
         * the inorder traversal of the tree.
         */
        kthSmallestNode = kthSmallestHelper1(traverseNode.right, k);
        // Now, at the end of the method, return the current kth-smallest-node in order to stop the function.
        return kthSmallestNode;
    }

    /**
     * A method that finds the k-th-smallest node of the current tree with the given root
     *
     * @param root the root of the tree to find the node from
     * @param k    The value of how small the node to be found is in the tree (e.g. 2nd-smallest or 5th-smallest)
     * @return the k-th-smallest node of the current tree
     * @throws IllegalArgumentException Throw this exception if the entered k value is invalid (i.e. it is greater than
     * the current number of nodes in the tree or is below 0.)
     */
    private Node kthSmallestHelper2(Node root, int k) {
        /* Throw this exception if the entered k value is invalid (i.e. it is greater than the current number of nodes
         * in the tree or is below 0.) */
        if (k < 0 || k > numNodes(this.root)) {
            throw new IllegalArgumentException();
        }
        // Resets the field that keeps track of the number of nodes visited when traversing the tree to 0
        numNodesVisited = 0;
        /*
         * Calls the helper function that will traverse the tree and find the k-th-smallest node.
         * Two separate functions are written to achieve this task to avoid the reuse of the above-mentioned field when
         * using this method multiple times in a row, as the reuse of this field can lead to inaccurate results.
         */
        return kthSmallestHelper1(root, k);
    }

    /**
     * A function that traverses and calculates the total number of nodes currently in the tree using recursion.
     *
     * @param root The root of the tree whose nodes are being counted
     * @return Total number of nodes currently in the B.S.T.
     */
    private int numNodes(Node root){
        // Base Case: If a null node is reached or a given tree is empty
        if (root == null) {
            return 0;
        }
        // Recursively traverse left & right subtree of current root node to visit all nodes currently in tree
        return 1 + numNodes(root.left) + numNodes(root.right);
    }

}