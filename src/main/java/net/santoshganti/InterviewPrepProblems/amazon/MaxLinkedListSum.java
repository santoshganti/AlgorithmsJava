package net.santoshganti.InterviewPrepProblems.amazon;

public class MaxLinkedListSum {
    private static int maxLinkedListSum(ListNode list) {
        if (list == null) return 0;
        if (list.next == null) return list.val;
        ListNode slow = list;
        ListNode fast = list;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = list;

        // Reverse here because you dont want to save this result in a variable as its O(1) space needed.
        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        int maxSum = Integer.MIN_VALUE;
        while (first != null && prev != null) {
            maxSum = Math.max(maxSum, first.val + prev.val);
            first = first.next;
            prev = prev.next;
        }
        return maxSum;
    }
}