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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int n=size-1;
        int ans=0;
        ListNode cop=head;
        while(cop!=null){
            if(cop.val==1)
                ans+=Math.pow(2,n);
            n--;
            cop=cop.next;
        }
        return ans;
    }
}