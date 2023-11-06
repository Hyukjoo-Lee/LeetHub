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
    // using 3 pointers ; current, prev, temp 
    // to keep track of nodes to update reserved node
    public ListNode reverseList(ListNode head) {
        // initialize current and prev node
        ListNode current = head;
        ListNode prev = null;
        while(current != null) {
            // temporaily store the next node of current node
            ListNode temp = current.next;
            // change pointer from -> to <- 
            current.next = prev;
            // move prev node to current node
            prev = current;
            // move current node to temp node
            current = temp;
        }
        // finally store prev node to head
        head = prev;
        return head;
    }
}