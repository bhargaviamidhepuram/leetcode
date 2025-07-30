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
    static int depth(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        return Math.max(left, right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int l1 = depth(root.left);
        int l2 = depth(root.right);
        if(Math.abs(l1 - l2) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}