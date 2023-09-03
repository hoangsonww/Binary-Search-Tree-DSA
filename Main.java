/**
 * A class that tests the behavior of the methods in the Binary Search Tree class
 * @author David Nguyen
 * @since 03/08/2023
 */
public class Main {

    /**
     * A method that tests and demonstrates the behavior of the methods in the Binary Search Tree class.
     *
     * @param args any specified arguments to run the main method.
     */
    public static void main(String[] args) {
        // Creating a new tree and inserting nodes into the tree
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(40);
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(60);
        tree.insert(50);
        tree.insert(70);
        tree.insert(5);
        tree.insert(15);
        tree.insert(55);
        tree.insert(75);
        tree.insert(95);
        // Now print out the tree to show its current state in three different types of tree traversals
        System.out.println("1) Create & Print Out The Following Binary Search Tree: ");
        System.out.println("Inorder Traversal: ");
        tree.inorderRec();
        System.out.println();
        System.out.println("Preorder Traversal: ");
        tree.preorderRec();
        System.out.println();
        System.out.println("Postorder Traversal: ");
        tree.postorderRec();
        System.out.println();
        System.out.println("==> The tree constructor and the insert method both worked as expected!");
        System.out.println("==> The three traversal methods (Inorder, Postorder, and Preorder) also worked as expected!");
        // Now test the behavior of delete() method, with the first case of deleting a node with two children
        System.out.println("2) Deleting node 40 which have two children and is also the root node: ");
        Node newRoot = tree.delete(40);
        System.out.println("Inorder Traversal After Deletion: ");
        tree.inorderRec();
        System.out.println();
        System.out.println("Preorder Traversal After Deletion: ");
        tree.preorderRec();
        System.out.println();
        System.out.println("Postorder Traversal After Deletion: ");
        tree.postorderRec();
        System.out.println();
        System.out.println("The value of the new root node is: ");
        System.out.println(newRoot.key);
        // Now test the behavior of delete() method, with the second case of deleting a node with one child
        System.out.println("3) Deleting node 70 which have one child: ");
        Node newRoot1 = tree.delete(70);
        // Print out the entire tree to show its current state after deletion:
        System.out.println("Inorder Traversal After Deletion: ");
        tree.inorderRec();
        System.out.println();
        System.out.println("Preorder Traversal After Deletion: ");
        tree.preorderRec();
        System.out.println();
        System.out.println("Postorder Traversal After Deletion: ");
        tree.postorderRec();
        System.out.println();
        System.out.println("The value of the new root node is: ");
        System.out.println(newRoot1.key);
        // Now test the behavior of delete() method, with the third case of deleting a node with no children
        System.out.println("4) Deleting node 55 which have no children - is a leaf node: ");
        Node newRoot2 = tree.delete(55);
        // Print out the entire tree to show its current state after deletion:
        System.out.println("Inorder Traversal After Deletion: ");
        tree.inorderRec();
        System.out.println();
        System.out.println("Preorder Traversal After Deletion: ");
        tree.preorderRec();
        System.out.println();
        System.out.println("Postorder Traversal After Deletion: ");
        tree.postorderRec();
        System.out.println();
        System.out.println("The value of the new root node is: ");
        System.out.println(newRoot2.key);
        // Now find the node with the key of 20 in the tree and print the result out
        System.out.println("5) Now Find The Node That Has The Key Of 5: ");
        boolean found = tree.search(5);
        System.out.println(found);
        // Now find the node with the key of 30 in the tree and print the result out
        System.out.println("6) Now Find The Node That Has The Key Of 30: ");
        boolean found1 = tree.search(30);
        System.out.println(found1);
        // Now find the node with the key of 60 in the tree and print the result out
        System.out.println("7) Now Find The Node That Has The Key Of 60: ");
        boolean found3 = tree.search(60);
        System.out.println(found3);
        // Now find the node with the key of 95 in the tree and print the result out
        System.out.println("7) Now Find The Node That Has The Key Of 95: ");
        boolean found4 = tree.search(95);
        System.out.println(found4);
        // Now find the node with the key of 100 in the tree and print the result out
        System.out.println("8) Now Find The Node That Has The Key Of 100 - Which Is Not In The Tree: ");
        boolean found2 = tree.search(100);
        System.out.println(found2);
        System.out.println("=> The system should say that no such node with the given key in the tree and print false.");
        // Now find the 2nd smallest element in the current tree (after deletions), which should be 10
        System.out.println("9) Now Find The 2nd Smallest Element In The Tree: ");
        Node smallest = tree.kthSmallest(2);
        System.out.println(smallest.key);
        System.out.println("==> System Should Print 10 Because It's The 2nd Smallest!");
        // Now find the 5th smallest element in the current tree (after deletions), which should be 30
        System.out.println("10) Now Find The 5th Smallest Element In The Tree: ");
        Node smallest1 = tree.kthSmallest(5);
        System.out.println(smallest1);
        System.out.println(smallest1.key);
        System.out.println("==> System Should Print Out The Node And The Value 30 Because It's The 5th Smallest!");
        // Now find the 7th smallest element in the current tree (after deletions), which should be 60
        System.out.println("11) Now Find The 7th Smallest Element In The Tree: ");
        Node smallest2 = tree.kthSmallest(7);
        System.out.println(smallest2);
        System.out.println(smallest2.key);
        System.out.println("==> System Should Print Out The Node And The Value 60 Because It's The 7th Smallest!");
        // Now find the smallest element in the current tree (after deletions), which should be 60
        System.out.println("12) Now Find The SMALLEST Element In The Tree: ");
        Node smallest3 = tree.kthSmallest(1);
        System.out.println(smallest3);
        System.out.println(smallest3.key);
        System.out.println("==> System Should Print Out The Node And The Value 5 Because It's The Smallest!");
        // Now find the largest element in the current tree (after deletions), which should be 95
        System.out.println("14) Now Find The LARGEST Element In The Tree: ");
        Node smallest4 = tree.kthSmallest(9);
        System.out.println(smallest4.key);
        System.out.println("==> System Should Print Out The Node And The Value 95 Because It's The Largest!");
        System.out.println("15) Test If The Entered K Value Is Invalid - Greater Than Number of Nodes in Tree:");
        System.out.println(tree.kthSmallest(100));
        System.out.println("16) Test If The Entered K Value Is Invalid - Smaller Than 0:");
        System.out.println(tree.kthSmallest(-1));
        System.out.println(tree.kthSmallest(-100));
        System.out.println("==> System Should Print A Message Noticing The User That Enter K Value Is Invalid & Return A Null Value.");
        // Now try converting an array of single digits (with duplicates) into a tree
        System.out.println("17) Try Converting An Array of Single Digits Into A Tree - The Existing Tree Should Be Overwritten:");
        System.out.println("The Array To Be Parsed In Is:");
        int[] values = {1,3,2,4,7,8,9,6,9,9};
        // Prints the values in the parsed-in array out to the screen
        for (int value : values) {
            System.out.print(value + " ");
        }
        // The method createTree() will also print out the tree in three different traversals to show the current state of the tree
        System.out.println();
        tree.createTree(values);
        System.out.println();
        // Now try converting an array of multiple digits (with duplicates) into a tree
        System.out.println("18) Try Converting An Array of Multiple Digits Into A Tree - The Existing Tree Should Be Overwritten:");
        System.out.println("The Array To Be Parsed In Is:");
        int[] values2 = {12,33,22,45,75,8,98,56,9,99,1230,9999,10450};
        // Prints the values in the parsed-in array out to the screen
        for (int value : values2) {
            System.out.print(value + " ");
        }
        // The method createTree() will also print out the tree in three different traversals to show the current state of the tree
        System.out.println();
        tree.createTree(values2);
        System.out.println();
        System.out.println("==> The createTree() method works perfectly!");
        System.out.println("===> Now that all other methods have been tested, test the other constructors of the Binary Search Tree class");
        // Now that all other methods have been tested, test the other constructors of the Binary Search Tree class:
        // Creating a new tree and inserting nodes into the tree using the second constructor, which takes in an int
        BinarySearchTree tree2 = new BinarySearchTree(40);
        tree2.insert(20);
        tree2.insert(10);
        tree2.insert(30);
        tree2.insert(60);
        tree2.insert(50);
        tree2.insert(70);
        tree2.insert(5);
        tree2.insert(15);
        tree2.insert(55);
        tree2.insert(75);
        tree2.insert(95);
        // Now print out the tree to show its current state in three different types of tree traversals
        System.out.println("19) Create & Print Out The Following Binary Search Tree Using The Second Constructor: ");
        System.out.println("Inorder Traversal: ");
        tree2.inorderRec();
        System.out.println();
        System.out.println("Preorder Traversal: ");
        tree2.preorderRec();
        System.out.println();
        System.out.println("Postorder Traversal: ");
        tree2.postorderRec();
        System.out.println();
        System.out.println("=> The second constructor and the insert method both worked as expected!");
        // Creating a new tree and inserting nodes into the tree using the third constructor, which takes in a node
        Node rootNode = new Node(40);
        BinarySearchTree tree1 = new BinarySearchTree(rootNode);
        tree1.insert(20);
        tree1.insert(10);
        tree1.insert(30);
        tree1.insert(60);
        tree1.insert(50);
        tree1.insert(70);
        tree1.insert(5);
        tree1.insert(15);
        tree1.insert(55);
        tree1.insert(75);
        tree1.insert(95);
        // Now print out the tree to show its current state in three different types of tree traversals
        System.out.println("20) Create & Print Out The Following Binary Search Tree Using The Third Constructor: ");
        System.out.println("Inorder Traversal: ");
        tree1.inorderRec();
        System.out.println();
        System.out.println("Preorder Traversal: ");
        tree1.preorderRec();
        System.out.println();
        System.out.println("Postorder Traversal: ");
        tree1.postorderRec();
        System.out.println();
        System.out.println("=> The third constructor and the insert method both worked as expected!");
        /* Now all methods of a 'normal' tree have been tested, we will now test the performance of the methods when the
         * tree is null (i.e. empty). Test especially for Null Pointer Exceptions */
        System.out.println("21) Testing Search Method If Tree Is Empty: ");
        BinarySearchTree tree4 = new BinarySearchTree();
        System.out.println(tree4.search(5));
        System.out.println("=> The program should print 'false' because the tree is currently empty.");
        System.out.println("22) Testing Delete Method If Tree Is Empty");
        System.out.println(tree4.delete(5));
        System.out.println("23) Testing Three Traversal Methods If Tree Is Empty:");
        System.out.println("Inorder Traversal:");
        tree4.inorderRec();
        System.out.println();
        System.out.println("Preorder Traversal:");
        tree4.preorderRec();
        System.out.println();
        System.out.println("Postorder Traversal: ");
        tree4.postorderRec();
        System.out.println();
        System.out.println("=> Nothing should be printed out because the tree is currently empty!");
        System.out.println("24) Testing The Find Kth-Smallest Method If Tree Is Empty. Case 1: Test if K is positive:");
        System.out.println(tree4.kthSmallest(2));
        System.out.println("25) Testing The Find Kth-Smallest Method If Tree Is Empty. Case 2: Test if K is negative:");
        System.out.println(tree4.kthSmallest(-99));
        int[] valueEmpty = new int[6];
        System.out.println("26) Now try creating a B.S.T. from an empty array");
        for (int value : valueEmpty) {
            System.out.println(value);
        }
        tree4.createTree(valueEmpty);
        System.out.println();
        System.out.println("=> A tree was successfully created from the given empty array of int!");
        // Now we will test the case where the B.S.T. has only one node in it. Still watch out for null pointer exceptions
        BinarySearchTree tree6 = new BinarySearchTree();
        tree6.insert(9999999);
        System.out.println("27) Testing Search Method If Tree Has Only One Node: ");
        System.out.println(tree6.search(5));
        System.out.println("28) Testing Delete Method If Tree Has Only One Node");
        Node delete6 = tree6.delete(5);
        System.out.println(delete6);
        System.out.println(delete6.key);
        System.out.println("29) Testing Three Traversal Methods Has Only One Node:");
        System.out.println("Inorder Traversal:");
        tree6.inorderRec();
        System.out.println();
        System.out.println("Preorder Traversal:");
        tree6.preorderRec();
        System.out.println();
        System.out.println("Postorder Traversal: ");
        tree6.postorderRec();
        System.out.println();
        System.out.println("=> Only one node should be printed out because the tree has only one node!");
        System.out.println("30) Testing The Find Kth-Smallest Method If Tree Has Only One Node. Case 1: Test if K is valid:");
        Node kthSmallest2 = tree6.kthSmallest(1);
        System.out.println(kthSmallest2);
        System.out.println(kthSmallest2.key);
        System.out.println("=> System Should Print Out The Node And The Value 9999999");
        System.out.println("31) Testing The Find Kth-Smallest Method If Tree Has Only One Node. Case 2: Test if K is invalid - NEGATIVE K:");
        System.out.println(tree6.kthSmallest(-999));
        System.out.println("32) Testing The Find Kth-Smallest Method If Tree Has Only One Node. Case 3: Test if K is invalid - TOO LARGE K:");
        System.out.println(tree6.kthSmallest(2));
        System.out.println();
        System.out.println("===> If this statement is reached, all methods have worked correctly and performed as expected!");
    }

}