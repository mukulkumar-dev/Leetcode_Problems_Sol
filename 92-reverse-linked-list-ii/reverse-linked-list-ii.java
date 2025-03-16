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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)
            return head;
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode previous=temp;

        for(int i=0;i<left-1;i++){
            previous=previous.next;
        }
        ListNode current=previous.next;

        for(int i=0;i<right-left;i++){
            ListNode num=current.next;
            current.next=num.next;
            num.next=previous.next;
            previous.next=num;
        }
        return temp.next;
    }
}