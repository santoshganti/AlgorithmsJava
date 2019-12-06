package trees.binarysearchtree.validateBST;

import trees.node.TreeNode;

public class ValidateBSTRecursion {
    TreeNode root;

    public boolean isValidBST(TreeNode root) {
        return isBSTUtil(root, null, null);
    }

    boolean isBSTUtil(TreeNode root, TreeNode left, TreeNode right) {
        //An empty tree is BST
        if (root == null) {
            return true;
        }

        if (left != null && root.val <= left.val) {
            return false;
        }

        if (right != null && root.val >= right.val) {
            return false;
        }

        return (isBSTUtil(root.left, left, root) && isBSTUtil(root.right, root, right));


    }

    public static void main(String[] args) {
        ValidateBSTRecursion tree = new ValidateBSTRecursion();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);

        if (tree.isValidBST(tree.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}

