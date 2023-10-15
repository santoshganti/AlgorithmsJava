package binarytree;

/**
 * Root: Node with no parent
 * Edge: Link from Parent to child
 * Leaf: Node with no children
 * Sibling: Children of same parent
 * Ancestor: Means parent, grand parent and so on
 * Depth of Node: Length of path from root to node
 * Height of Node: Length of path from node to the deepest node
 * Height of tree: Height of root node
 * Depth of a tree: Depth of root node
 * predecessor: Predecessor of a node is the immediate previous node in inorder traversal of a binary tree
 * successor: is the the immediate next node in the inorder traversal of a tree
 * in order traversal is left -> root -> right
 */

/**
 * Types of Binary Tree
 *
 * Strict Binary Tree: If each node has either 2 children or none
 *
 * Full Binary Tree: If each non leaf node has 2 children and all leaf nodes are at same level
 *
 * Complete Binary Tree: If all levels are completely filled except the possibly the last level and the last level has
 * all keys as left as possible
 *
 *
 */

/**
 * Level Order Traversal
 *
 * CreateQueue(Q)
 *
 * enqueue(root)
 *
 * while(QUeue is not empty){
 *     enqueue(children of the element)
 *     dequeue() and print
 * }
 */
public class BinaryTree1 {
    //creation of tree
    static class Node{
        int data;
        Node rightChild;
        Node leftChild;
    }

    Node root;


}
