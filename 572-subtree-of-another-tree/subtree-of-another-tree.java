/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String main=preorder(root);
        String sub=preorder(subRoot);
        return main.contains(sub);
    }
    public String preorder(TreeNode node){
        if(node==null) return "N";
        return "#" +node.val+" "+preorder(node.left)+" "+preorder(node.right);
    }
}