# Binary Search Tree - DSA Project

## Overview
This Java project implements a Binary Search Tree (BST) with fundamental operations such as insertion, deletion, and traversal. Designed with efficiency and simplicity in mind, this class provides an intuitive way to manage and manipulate a collection of integers in a hierarchical structure.

## Features
- **Dynamic Tree Construction**: Create a BST either empty, with a single root node, or by parsing an array of integers.
- **Insertion**: Add new elements to the tree while maintaining the BST properties.
- **Deletion**: Remove elements from the tree, adjusting the structure as necessary to preserve BST properties.
- **Search**: Check whether a specific value exists within the tree.
- **Traversal**: Inorder, preorder, and postorder traversal methods to explore the tree's contents.
- **K-th Smallest Element**: Retrieve the k-th smallest element from the tree, demonstrating an application of inorder traversal.
- **Create Tree from Array**: Build a new BST from an array of integers, replacing any existing tree.

## Prerequisites
- Java Development Kit (JDK) 11 or later.
- A Java IDE (e.g. IntelliJ IDEA or Eclipse) is highly recommended.

## Setup and Compilation
1. Ensure Java is installed on your system. You can verify this by running `java -version` in your command line or terminal.
2. Clone or download this repository to your local machine.
3. Navigate to the directory containing the `BinarySearchTree.java` file.
4. Compile the class using the Java compiler:
   ```bash
   javac BinarySearchTree.java
   ```

## Usage
### Creating a BST
Instantiate a BST object in your Java program. You can create a tree in three ways:
- Empty tree: `BinarySearchTree bst = new BinarySearchTree();`
- Tree with an integer root: `BinarySearchTree bst = new BinarySearchTree(10);`
- Tree with a Node as root: `BinarySearchTree bst = new BinarySearchTree(new Node(10));`

### Inserting Elements
Add elements to your BST:
```java
bst.insert(5);
bst.insert(15);
```

### Deleting Elements
Remove elements by value:
```java
bst.delete(5);
```

### Searching for Elements
Check if an element exists in the tree:
```java
boolean found = bst.search(15);
```

### Traversing the Tree
Perform different tree traversals:
```java
bst.inorderRec();
bst.preorderRec();
bst.postorderRec();
```

### Finding the K-th Smallest Element
Retrieve the k-th smallest element from the BST:
```java
Node kthSmallest = bst.kthSmallest(3);
if (kthSmallest != null) {
    System.out.println("K-th Smallest: " + kthSmallest.key);
}
```

### Creating a Tree from an Array
Overwrite the current tree with a new tree constructed from an array of integers:
```java
int[] values = {3, 1, 4, 2};
bst.createTree(values);
```

### Main File
There is also a Main.java file, which comprehensively tests all the functions and methods of the BST class. Feel free to run it as follows:
```bash
java Main
```

## Contributing
Contributions to improve the Binary Search Tree implementation or extend its functionality are welcome. Please fork the repository, make your changes, and submit a pull request with a clear description of your modifications or additions.

---

Created with ❤️ by [Son Nguyen](https://github.com/hoangsonww) in 2023.
