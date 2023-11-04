package net.santoshganti.Base.node;

public class Node {
    private int value;
    private int height;
    private Node left;
    private Node right;

    public int getHeight() {
        return height;
    }//end of method

    public void setHeight(int height) {
        this.height = height;
    }//end of method

    public int getValue() {
        return value;
    }//end of method

    public void setValue(int value) {
        this.value = value;
    }//end of method

    public Node getLeft() {
        return left;
    }//end of method

    public void setLeft(Node left) {
        this.left = left;
    }//end of method

    public Node getRight() {
        return right;
    }//end of method

    public void setRight(Node right) {
        this.right = right;
    }//end of method

    @Override
    public String toString() {
        return value + "";
    }//end of method
}
