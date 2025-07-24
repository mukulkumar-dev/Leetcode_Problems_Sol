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
    private Integer prev = null;
    private int count = 0;
    private int max = 0;
    private List<Integer> modes = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        return modes.stream().mapToInt(i -> i).toArray();
    }
    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if (prev != null) {
            if (node.val == prev) {
                count++;
            } else {
                count = 1;
            }
        } else {
            count = 1; 
        }
        if (count > max) {
            max = count;
            modes.clear();
            modes.add(node.val);
        } else if (count == max) {
            modes.add(node.val);
        }
        prev = node.val;
        inOrder(node.right);
    }
}