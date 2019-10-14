package linkedlist;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

    Node head;

    private void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    private void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            return;
        }

        //Create the node
        Node new_node = new Node(new_data);
        //copy the next pointer from prev node because this node is replacing the prev node
        new_node.next = prev_node.next;

        //now point prev node's next to new node to insert it
        prev_node.next = new_node;
    }

    private void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
        return;
    }

    public void delete(int position) {
        if (head == null) {
            return;
        }

        Node temp = head;
        if (position == 0) {
            head = temp.next;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }

        Node next = temp.next.next;
        temp.next = next;

    }

    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return true;
            }

            current = current.next;
        }
        return false;
    }

    public int getNth(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }

        assert (false);
        return 0;
    }

    public void printNthFromLast(int n) {
        int len = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        if (len < n) {
            return;
        }

        temp = head;
        for (int i = 0; i < len - n + 1; i++) {
            temp = temp.next;
        }

        System.out.println(temp.data);
    }

    public  int printMiddle(){
        Node slowPointer = head;
        Node fastPointer = head;
        if (head != null) {
            while(fastPointer != null && slowPointer != null){
                fastPointer = fastPointer.next.next;
                slowPointer = slowPointer.next;
            }
        }
        return slowPointer.data;
    }

    public void detectLoop(){
        Node slowPointer = head;
        Node fastPointer = head;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(6);
        list.push(7);
        list.push(1);
        list.append(4);
        list.insertAfter(list.head.next, 8);
        list.printList();
    }

    private void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
}