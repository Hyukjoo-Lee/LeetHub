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
        /**
            주어진 singly linked-list를 

            L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

            와 같은 순서로 재배열하여 반환하는 문제입니다.

            
            예로서, 
            [1,2,3,4,5,6,7,8] 가 주어지면
            
            [1,8,2,7,3,6,4,5] 가 반환되어야 합니다.

            1. 처음에 연결 리스트를 두 부분으로 나눠서
            2. 두 번째 부분을 역순으로 만듭니다.
            3. 마지막으로 두 부분을 병합하여 반환합니다.
         */

        if(head == null || head.next == null) return;

        // 첫 번째 리스트의 헤드 초기화
        ListNode list1 = head;
        // 두 번째 절반 리스트의 시작점을 찾기 위한 느린 포인터 (중간점)
        ListNode slow = head;
        // 리스트 끝을 찾기 위한 빠른 포인터
        ListNode fast = head;
        // 첫 번째 절반 리스트의 끝을 가리킬 포인터
        ListNode prev = null;

        // slow 포인터와 fast 포인터를 이용해 리스트를 두 부분으로 나눔
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        // 두 번째 리스트를 역순으로 만듬
        ListNode list2 = reverse(slow);

        // 나눠진 두 리스트를 병합
        mergeTwoLists(list1, list2);
    }


    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while(current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public void mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1 != null) {
            ListNode list1_next = list1.next;
            ListNode list2_next = list2.next;
            list1.next = list2;
            if(list1_next == null) {
                break;
            }
            list2.next = list1_next;
            list1 = list1_next;
            list2 = list2_next;
        }
    }

}