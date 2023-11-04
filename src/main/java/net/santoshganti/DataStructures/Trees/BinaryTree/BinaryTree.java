package net.santoshganti.DataStructures.Trees.BinaryTree;

import net.santoshganti.Base.node.Node;

import java.util.*;

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

    public void spiralWithTwoStack(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                root = s1.pop();
                System.out.println(root.getValue() + " ");
                if (root.getRight() != null) {
                    s2.push(root.getRight());
                }
                if (root.getLeft() != null) {
                    s2.push(root.getLeft());
                }
            }

            while (!s2.isEmpty()) {
                root = s2.pop();
                System.out.println(root.getValue() + " ");
                if (root.getRight() != null) {
                    s1.push(root.getRight());
                }
                if (root.getLeft() != null) {
                    s1.push(root.getLeft());
                }
            }
        }

    }

    public List<List<Integer>> spiralWithOneDeque(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> li = new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<Node>();
        if (root == null) return res;
        boolean flip = true;
        int level = 1;

        queue.add(root);
        while (queue.size() != 0) {
            Node node = queue.poll();
            if (flip)
                li.add(node.getValue());
            else
                li.add(0, node.getValue());

            if (node.getLeft() != null)
                queue.add(node.getLeft());
            if (node.getRight() != null)
                queue.add(node.getRight());
            if (--level == 0) {
                level = queue.size();
                res.add(new ArrayList(li));
                li.clear();
                flip = !flip;
            }
        }
        return res;
    }

    public List<List<Integer>> levelOrderList(Node root) {
        //put root into queue
        //while queue is not empty
        //dequeu and put its children in the queue
        //print the queue in natural order for level order
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {
            //start at current level
            levels.add(new ArrayList<Integer>());

            //number of elements in the current level
            int levelLength = queue.size();

            for (int i = 0; i < levelLength; i++) {
                Node current = queue.remove();

                //fill the level array
                levels.get(level).add(current.getValue());

                //add the children to the queue
                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
            }
            level++;
        }
        return levels;
    }

    public void spiralWithOneDequeDelimiter(Node root) {

    }

    //MARK - delete tree
    void deleteTree() {
        root = null;
        System.out.println("Binary tree has been deleted");
//        List<List<Integer>> res = new ArrayList<>();
    }


}
