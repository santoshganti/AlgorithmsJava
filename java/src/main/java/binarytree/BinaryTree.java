package binarytree;

/**
    Tree is a hierarchical structure and main uses of the trees include maintaining hierarchical data
    providing moderate access and insert/delete operations. Binary trees are special cases of tree where
    every node has at most two children.

    1. The maximum number of nodes at level l of a binary tree is 2^(l-1)
    2. The maximum number of nodes in a binary tree of height h is 2^h - 1
    3. In a binary tree with N nodes, minimum possible height or minimum possible number of levels is
    log(N+1) base 2

    nth catalan numbers - T(n) = (2n)! / (n+1)!n!

    No of Labeled Trees = (Number of unlabeled trees) * n!
                        = [(2n)!/(n+1)!n!] * n!
 */

import java.util.*;

public class BinaryTree {
    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    static Node root;
    static Node temp = root;

    static void inorder(Node temp) {
        if (temp == null) {
            return;
        }
        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    static void preorder(Node temp) {
        System.out.println(temp.key + " ");
        preorder(temp.left);
        preorder(temp.right);

    }

    static void postorder(Node temp) {
        postorder(temp.left);
        postorder(temp.right);
        System.out.println(temp.key + " ");

    }

    void printLevelOrder() {
        int h = height(root);
        for (int i = 0; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }
    void printGivenLevel(Node root, int level){
        if(root == null){
            return;
        }

        if(level == 1){
            System.out.println(root.key+" ");
        }else if(level > 1){
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
    private int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }


    }

    static void insert(Node temp, int key) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        //Do level order traversal until we find an empty place
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }
    }

    static void delete(Node temp, Node d_node) {
        Queue<Node> q = new LinkedList<>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == d_node) {
                temp = null;
                return;
            }

            if (temp.right == d_node) {
                temp.right = null;
                return;
            } else {
                q.add(temp.right);
            }

            if (temp.left == d_node) {
                temp.left = null;
                return;
            } else {
                q.add(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print("Inorder traversal before insertion:");
        inorder(root);

        int key = 12;
        insert(root, key);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);

        System.out.println("\n Before deletion");
        inorder(root);

        Node node = new Node(8);
        delete(root, node);

        System.out.println("\n After deletion");
        inorder(root);

    }
}
