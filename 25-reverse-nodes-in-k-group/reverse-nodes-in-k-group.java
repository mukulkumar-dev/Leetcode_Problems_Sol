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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)
            return head;
        ListNode copy = new ListNode(0);
        copy.next = head;
        ListNode previous = copy;
        ListNode current = head;

        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }

        while(count >= k){
            current = previous.next;
            ListNode temp = current.next;

            for(int i=1; i<k; i++){
                current.next= temp.next;
                temp.next = previous.next;
                previous.next = temp;
                temp= current.next;
            }

            previous=current;
            count -=k;
        }
        return copy.next;
    }
}