package DataStructures.Tree;

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Insert a node into the tree
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Inorder Traversal (Left, Root, Right)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

public class TreeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.root = tree.insert(tree.root, value);
        }

        System.out.println("Inorder Traversal of the tree:");
        tree.inorder(tree.root);

        scanner.close();
    }
}
