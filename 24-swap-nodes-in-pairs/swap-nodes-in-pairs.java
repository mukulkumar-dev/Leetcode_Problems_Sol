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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode previous = dummy;
        ListNode current = head;

        while(current!=null && current.next !=null){
            ListNode non = current.next.next;
            ListNode second = current.next;

            second.next =  current;
            current.next = non;
            previous.next = second;

            previous = current;
            current = non;
        }
        return dummy.next;
    }
}