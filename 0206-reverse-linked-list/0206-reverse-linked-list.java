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
    public ListNode reverseList(ListNode head) {
        /**
            간단하게 linked list 를 reverse 하는 문제

            prev 노드는 전 노드를 추적할거고
            cur 노드는 리스트를 looping 하기 위한 노드
            temp 노드는 cur 노드의 다음 노드를 일시적을 저장하기 위해 사용됩니다.

            예를 들어

            null -> 1 -> 2 -> 3 -> null 이 주어진다면
            prev.  cur. temp 로 초기화하고
            다음 loop 에서 전 노드를 추적하기 위한 수단으로 temp 를 cur.next 로 저장 후
                 <-
            1. cur.next 를 prev 로 (reverse pointer)

            2. prev 노드 이동 -> cur 로

            3. cur = temp ... 반복

            마지막에 head 를 prev 로

            그리고 head 를 리턴합니다.

            time complexity 는 모든 노드를 방문하기 때문에 O(N),

            space complextiy 는 몇가지 변수만 사용 되었기 때문에 O(1) 입니다.
         */

         ListNode cur = head;
         ListNode prev = null;

         while(cur != null) {
            // 임시적으로 cur 노드의 다음 노드를 저장
            ListNode temp = cur.next;
            cur.next = prev; // 1
            prev = cur; // 2
            cur = temp; // 3
         }

         head = prev;
         return head;
         
    }
}