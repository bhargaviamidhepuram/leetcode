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
    ArrayList<Integer> l = new ArrayList<>();
    public List<Integer> traversal(TreeNode root){
        if(root  == null){
            return l;
        }
        traversal(root.left);
        traversal(root.right);
        l.add(root.val);
        return l;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        return traversal(root);
    }
}