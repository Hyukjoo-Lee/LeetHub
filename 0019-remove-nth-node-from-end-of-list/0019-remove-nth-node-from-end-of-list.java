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
        /**
            remove the nth node from the end of a singly-linked list
            slow
            fast

            1 2 3 4 5
                s 
                    f

         */

         ListNode dummy = new ListNode();
         dummy.next = head;

         // two pointers
         ListNode slow = dummy;
         ListNode fast = dummy;
         
         // if n = 32 and the number of nodes = 100
         // fast pointer will point 33th node 
         // and we need to remove 78th node

         // move the fast pointer to n+1
         for(int i = 0; i <= n; i++) {
             fast = fast.next;
         }
         
         // move the both of fast and slow pointer until the fast pointer reaches at the end
         // then slow pointer will point 77th node
         while(fast != null) {
             fast = fast.next;
             slow = slow.next; 
         }
        // 77 => 79
        slow.next = slow.next.next;

        return dummy.next;

    }
}