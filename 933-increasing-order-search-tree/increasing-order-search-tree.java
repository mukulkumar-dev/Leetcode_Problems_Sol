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
    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root,null);
    }
    public TreeNode increasingBST(TreeNode node,TreeNode par){
        if(node==null){
            return par;
        }
        TreeNode newRoot=increasingBST(node.left,node);
        node.left=null;
        node.right=increasingBST(node.right,par);
        return newRoot;
    }
}