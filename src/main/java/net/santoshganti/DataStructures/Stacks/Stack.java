package net.santoshganti.DataStructures.Stacks;

public class Stack {
    private Node top;

    public boolean isEmpty() {

        return top == null;
    }

    public int peek() {
        return top.data;
    }

    //Move the
    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;

    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    private static class Node {
        private final int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }
}
