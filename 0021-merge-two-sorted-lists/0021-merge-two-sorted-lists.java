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
// using a node to keep track of the head of merged list 
// using two pointers list1 and list2 to traverse both lists
// tail is tracking of the last node in the merged list
// compare the values and add the smaller value between current nodes' value 
// between the two given lists
// time complexity is O(m + n): number of nodes in list1 and list2
// and a space complexity of O(1).
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	// will be the head of the merged list 
        ListNode merged = new ListNode();
    	// to track the last node in the merged list
        ListNode tail = merged;
        while(list1 != null && list2 != null) {
    		// compare the values
            if(list1.val < list2.val) {
    			// add the smaller value
                tail.next = list1;
                // keep tracking the current node
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
    		// keep tracking the next node
            tail = tail.next;
        }
    	//  to treat remaining nodes 
        tail.next = (list1 != null) ? list1 : list2;
        return merged.next;
    }
}