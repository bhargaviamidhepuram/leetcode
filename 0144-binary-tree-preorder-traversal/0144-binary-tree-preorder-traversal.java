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
    ArrayList<Integer> a =  new ArrayList<>();
    public List<Integer> traversal(TreeNode root){
        if(root == null){
            return a;
        }
        a.add(root.val);
        traversal(root.left);
        traversal(root.right);
        return a;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        return traversal(root);
    }
}