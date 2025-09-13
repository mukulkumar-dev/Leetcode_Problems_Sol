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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp = head;
        Set<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }
        int count = 0;
        boolean flag = false; 
        while(temp != null){
            if(st.contains(temp.val) && !flag){
                count++;
                flag = true;
            }
            else if (!st.contains(temp.val) && flag){
                flag = false;
            }
            temp = temp.next;
        }
        return count;
    }
}