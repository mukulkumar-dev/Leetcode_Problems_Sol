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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow;
        ListNode prev = null;
        ListNode Next = null;
        while(cur!=null){
            Next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = Next;
        }
        while(prev!=null){
            if(head.val==prev.val){
                head = head.next;
                prev = prev.next;
            }else{
                return false;
            }
        }
        return true;
    }
}