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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> currSum=new ArrayList<>();
        dfs(root,targetSum, currSum, result);
        return result;
    }
    public static void dfs(TreeNode root, int targetSum, List<Integer> currSum, List<List<Integer>> result){
        if(root==null) return;
        currSum.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val) {
            result.add(new ArrayList<>(currSum));  
        } else {
            dfs(root.left, targetSum - root.val, currSum, result);
            dfs(root.right, targetSum - root.val, currSum, result);
        }
        currSum.remove(currSum.size()-1);
    }
}