package reverselinkedlist;

public class ReverseLinkedListInRange {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        //previous reference to hold a prev node later on
        ListNode prev = null;

        //current node which holds head initially and inner elements as we loop through
        ListNode current_node = head;

        //Traverse the list and get the range while decrementing it.
        while (m > 1) {
            prev = current_node;
            current_node = current_node.next;
            m--;
            n--;
        }

        ListNode connection = prev;
        ListNode tail = current_node;

        while (n > 0) {
            //Regular reverse a linked list logic
            ListNode next_node = current_node.next;
            current_node.next = prev;
            prev = current_node;
            current_node = next_node;

            //Go till the given upper range hence decrementing it
            n--;
        }

        //Connecting the nodes which aren't reversed to the reversed node
        if (connection != null) {
            connection.next = prev;
        } else {
            head = prev;
        }

        tail.next = current_node;

        return head;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);
        node1.next.next.next.next.next = null;

        ListNode res = reverseBetween(node1,2,4);

        System.out.println(res.val);

    }
}
