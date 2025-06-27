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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);
        ListNode smallHead=dummy1;
        ListNode highHead=dummy2;
        while(head!=null){
            if(head.val<x){
                smallHead.next=head;
                smallHead=smallHead.next;
            }else{
                highHead.next=head;
                highHead= highHead.next;
            }
            head=head.next;
        }
        highHead.next=null;
        smallHead.next=dummy2.next;
        return dummy1.next;
    }
}