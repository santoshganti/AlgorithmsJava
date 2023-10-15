package trees.binarysearchtree;

import java.util.*;

import trees.node.Node;

public class BinarySearchTree {
    Node root;

    public Node getRoot() {
        return root;
    }

    //MARK - Constructor
    BinarySearchTree() {
        root = null;
    }

    //MARK - insert values into BST
    void insert(int value) {
        root = insert(root, value);
    }

    Node insert(Node currentNode, int value) {
        if (currentNode == null) {
            System.out.println("Successfully inserted " + value + " in BST");
            return createNewNode(value);
        } else if (value <= currentNode.getValue()) {
            currentNode.setLeft(insert(currentNode.getLeft(), value));
            return currentNode;
        } else {
            currentNode.setRight(insert(currentNode.getRight(), value));
            return currentNode;
        }
    }

    //MARK - create a new blank node method
    public Node createNewNode(int value) {
        Node node = new Node();
        node.setValue(value);
        return node;
    }

    //MARK - delete a node from BST
    public void deleteNodeOfBST(int value) {
        System.out.println("\n\nDeleting " + value + " from BST");
        deleteNodeOfBST(root, value);
    }

    public Node deleteNodeOfBST(Node root, int value) {
        if (root == null) {
            System.out.println("Value not found in BST");
            return null;
        }

        if (value < root.getValue()) {
            root.setLeft(deleteNodeOfBST(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setLeft(deleteNodeOfBST(root.getLeft(), value));
        } else {
            //if the currentNode is the node to be deleted
            if (root.getLeft() != null && root.getRight() != null) {
                //if node to be deleted both have children
                Node temp = root;

                //Finding minimum element from right subtree
                Node minNodeForRight = minimumElement(temp.getRight());

                //Replacing current node with minimum node from the right subtree
                root.setValue(minNodeForRight.getValue());

                //Deleting the minimum node from the right node
                root.setRight((deleteNodeOfBST(root.getRight(), minNodeForRight.getValue())));
            } else if (root.getLeft() != null) {
                //If node to be deleted has only one right child
                root = root.getLeft();
            } else if (root.getRight() != null) {
                // if the nodeToBeDeleted has only right child
                root = root.getRight();
            } else {
                //If nodeToBeDeleted do not have child i.e., a leaf node
                root = null;
            }
        }

        return root;
    }

    //MARK - get minimum element in the binary search tree
    public static Node minimumElement(Node root) {
        if (root.getLeft() == null) {
            return root;
        } else {
            return minimumElement(root.getLeft());
        }
    }

    //MARK = search a node in BST
    void searchForValue(int value) {
        searchForValue(root, value);
    }

    Node searchForValue(Node node, int value) {
        if (node == null) {
            System.out.println("Value: " + value + " not found in BST.");
            return null;
        } else if (node.getValue() == value) {
            System.out.println("Value: " + value + " found in BST.");
            return node;
        } else if (value < node.getValue()) {
            return searchForValue(node.getLeft(), value);
        } else {
            return searchForValue(node.getRight(), value);
        }
    }

    //MARK - Level order traversal of a BST
    void levelOrderTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        System.out.println("\n Printing level order traversal of tree");
        if (root == null) {
            System.out.println("The tree doesn't exists");
            return;
        }

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

    //MARK - Delete entire BST
    public void deleteTree() {
        System.out.println("Deleting entire Tree...");
        root = null;
        System.out.println("Tree deleted successfully !");
    }

    //MARK - method to print tree graphically
    void printTreeGraphically() {
        Queue<Node> queue = new LinkedList<Node>();
        Queue<Integer> level = new LinkedList<Integer>();

        int CurrentLevel = 1;
        boolean previousLevelWasAllNull = false;
        queue.add(root);
        level.add(1);

        System.out.println("\nPrinting Level order traversal of Tree...");
        if(root == null) {
            System.out.println("Tree does not exists !");
            return;
        }

        while (!queue.isEmpty()) {
            if(CurrentLevel == level.peek()) { //if we are in the same level
                if(queue.peek()==null) {
                    queue.add(null);level.add(CurrentLevel+1);
                }else {
                    queue.add(queue.peek().getLeft());level.add(CurrentLevel+1);
                    queue.add(queue.peek().getRight());level.add(CurrentLevel+1);
                    previousLevelWasAllNull = false;
                }
                System.out.print(queue.remove() + "  ");level.remove();
            }else { //level has changed
                System.out.println("\n");
                CurrentLevel++;
                if(previousLevelWasAllNull == true) {
                    break;
                }
                previousLevelWasAllNull = true;
            }
        }//end of loop
    }



}
