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
    public void reorderList(ListNode head) {

        int length = 0;

        ListNode pointer = head;

        // Find length
        while (pointer != null) {
            length++;
            pointer = pointer.next;
        }

        // Split the list
        pointer = head;

        int counter = (length + 1) / 2;

        while (counter > 0) {

            if (counter == 1) {
                ListNode cut = pointer;
                pointer = pointer.next;
                cut.next = null;
            }
            else {
                pointer = pointer.next;
            }

            counter--;
        }

        // Reverse second half
        ListNode prev = null;

        while (pointer != null) {

            ListNode next = pointer.next;

            pointer.next = prev;

            prev = pointer;
            pointer = next;
        }

        // Merge the two lists
        ListNode pointer1 = head;
        ListNode pointer2 = prev;

        while (pointer1 != null && pointer2 != null) {

            ListNode next1 = pointer1.next;
            ListNode next2 = pointer2.next;

            pointer1.next = pointer2;
            pointer2.next = next1;

            pointer1 = next1;
            pointer2 = next2;
        }
    }
}
