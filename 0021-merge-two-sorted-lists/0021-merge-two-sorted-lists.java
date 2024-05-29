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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /**
            두 개의 정렬된 리스트를 하나의 정렬된 리스트로 병합하여 반환하는 문제입니다.

            1->2->4
            1->3->4

            가 주어진다면
            1->1->2->3->4->4 로 병합하여 반환합니다.

            새로운 리스트의 더미 노드를 생성해서
            
            각 리스트의 값을 비교하여 다음 노드를 가리키는 포인터를 업데이트 합니다.

            값이 같은 경우도 처리합니다.

            if list1.val <= list2.val,

            last.next = list1,
            list1 = list1.next ...
         */
        
        ListNode head = new ListNode();
        // 마지막 노드를 가리키는 포인터
        ListNode last = head;

        while (list1 != null && list2 != null) {
            // list1의 값이 list2의 값보다 작거나 같으면
            if (list1.val <= list2.val) {
                // 마지막 노드의 다음 노드로 list1을 연결
                last.next = list1;
                // list1을 다음 노드로 이동
                list1 = list1.next;
            } else {
                // list2의 값이 더 작으면 list2를 연결
                last.next = list2;
                // list2를 다음 노드로 이동
                list2 = list2.next;
            }
            
            // 마지막 노드를 다음 노드로 갱신
            last = last.next;
        }

        // 남아 있는 노드들을 처리
        if (list1 != null) {
            last.next = list1;
        } else {
            last.next = list2;
        }
        
        return head.next;
    }
}
