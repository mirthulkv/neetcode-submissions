/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;

        ListNode ptr = head;

        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }

        int count = length - n;

        // Remove the first node
        if (count == 0) {
            return head.next;
        }

        ListNode curr = head;
        ListNode prev = null;

        // Move curr to the node we want to remove
        for (int i = 0; i < count; i++) {
            prev = curr;
            curr = curr.next;
        }

        // Remove curr
        prev.next = curr.next;

        return head;
    }
}
