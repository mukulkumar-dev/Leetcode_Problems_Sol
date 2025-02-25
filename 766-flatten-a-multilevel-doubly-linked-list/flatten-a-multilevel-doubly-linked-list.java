/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)
            return null;

        Node current=head;
        Stack<Node> stack=new Stack<>();
        while(current!=null){
            if(current.child!=null){
                Node nextNode=current.next;

                current.next=current.child;
                current.child.prev=current;
                current.child=null;

                if(nextNode!=null){
                    stack.push(nextNode);
                }
            }
            else if(current.next==null && !stack.isEmpty()){
                    Node nextNode=stack.pop();
                    current.next=nextNode;
                    nextNode.prev=current;
            }
            current=current.next;
        }
        return head;
    }
}