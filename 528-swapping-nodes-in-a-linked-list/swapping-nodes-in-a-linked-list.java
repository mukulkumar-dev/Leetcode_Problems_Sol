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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null ||head.next==null)
            return head;
        ListNode start=head;
        ListNode end=head;
        ListNode point=head;
        for(int i=1;i<k;i++){
            start=start.next;
        }
        point=start;
        while(start.next!=null){
            end=end.next;
            start=start.next;
        }
        int temp=point.val;
        point.val=end.val;
        end.val=temp;
        return head;
    }
}