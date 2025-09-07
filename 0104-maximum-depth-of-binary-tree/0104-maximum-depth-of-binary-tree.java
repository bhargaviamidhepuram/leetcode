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
    static int depth(TreeNode r){
        if(r == null){
            return 0;
        }
        int left = depth(r.left);
        int right = depth(r.right);
        return Math.max(left, right) + 1;
    }
    public int maxDepth(TreeNode root) {
        return depth(root);
    }
}