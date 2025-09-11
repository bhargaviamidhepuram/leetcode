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
    static int count(TreeNode r, boolean flag){
        if(r == null){
            return 0;
        }
        if(r.left == null && r.right == null)
        return flag ? r.val : 0;
        int a = count(r.left, true);
        int b = count(r.right, false);
        return a + b;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return count(root, false);
    }
}