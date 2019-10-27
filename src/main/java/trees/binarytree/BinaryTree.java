package trees.binarytree;

import java.util.Queue;

import trees.node.Node;

import java.util.LinkedList;

/**
 * Tree is a hierarchical structure and main uses of the trees include maintaining hierarchical data
 * providing moderate access and insert/delete operations. Binary trees are special cases of tree where
 * every node has at most two children.
 * <p>
 * 1. The maximum number of nodes at level l of a binary tree is 2^(l-1)
 * 2. The maximum number of nodes in a binary tree of height h is 2^h - 1
 * 3. In a binary tree with N nodes, minimum possible height or minimum possible number of levels is
 * log(N+1) base 2
 * <p>
 * nth catalan numbers - T(n) = (2n)! / (n+1)!n!
 * <p>
 * No of Labeled Trees = (Number of unlabeled trees) * n!
 * = [(2n)!/(n+1)!n!] * n!
 */

public class BinaryTree {
    Node root;

    //Constructor for creating a blank binary tree
    BinaryTree() {
        this.root = null;
    }

    //MARK - insert method of binary tree
    void insert(int value) {
        Node node = new Node();
        node.setValue(value);

        if (root == null) {
            root = node;
            System.out.println("Successfully inserted new node at root");
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode.getLeft() == null) {
                currentNode.setLeft(node);
                System.out.println("Successfull inserted new node at the deepest left");
                break;
            } else if (currentNode.getRight() == null) {
                currentNode.setRight(node);
                System.out.println("sucessfully inserted new node at the deepest right");
                break;
            } else {
                queue.add(currentNode.getLeft());
                queue.add(currentNode.getRight());
            }
        }
    }

    //MARK - search method for binary tree
    void search(int value) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode.getValue() == value) {
                System.out.println("Value-" + value + " is found in the tree! ");
                return;
            } else {
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }

                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
            System.out.println("Value -" + value + " is not found in the tree");
        }
    }

    //MARK - delete node from binary tree
    void deleteNodeOfBinaryTree(int value) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            //If node is found then copy the deepest node here and delete the deepest node
            if (currentNode.getValue() == value) {
                currentNode.setValue(getDeepestNode().getValue());
                deleteDeepestNode();
                System.out.println("Deleted the node");
                return;
            } else {
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
        }
        System.out.println("Did not find the node");
    }

    //MARK - delete deepest node from binary tree
    private void deleteDeepestNode() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node previousNode, currentNode = null;

        while (!queue.isEmpty()) {
            previousNode = currentNode;
            currentNode = queue.remove();

            if (currentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            } else if (currentNode.getRight() == null) {
                currentNode.setLeft(null);
                return;
            }

            queue.add(currentNode.getLeft());
            queue.add(currentNode.getRight());
        }
    }

    //MARK = get deepest node of last level in binary tree
    private Node getDeepestNode() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node currentNode = null;
        while (!queue.isEmpty()) {
            currentNode = queue.remove();

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }

        return currentNode;
    }

    //MARK - preorder traversal of binary tree
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    //MARK - postOrder traversal of binary tree
    void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getValue() + " ");

    }

    //MARK - inOrder traversal of binary tree
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.println(node.getValue() + " ");
        inOrder(node.getRight());
    }

    //MARK - level order traversal of binary tree

    /**
     * leverlOrderTraversal(root){
     * create a Queue(Q)
     * enqueu(root)
     * while(queue is not empty){
     * enqueue the child of first element
     * dequeue and print
     * }
     * }
     */

    void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.println(currentNode.getValue() + " ");
            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
    }

    //MARK - delete tree
    void deleteTree() {
        root = null;
        System.out.println("Binary tree has been deleted");
    }


}
