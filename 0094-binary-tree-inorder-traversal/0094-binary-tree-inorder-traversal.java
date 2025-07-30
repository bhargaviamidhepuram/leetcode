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
    ArrayList<Integer> l =  new ArrayList<>();
    public List<Integer> traversal(TreeNode root){
        if(root == null){
            return List.of();
        }
        traversal(root.left);
        l.add(root.val);
        traversal(root.right);
        return l;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        //ArrayList<Integer> l =  new ArrayList<>();
        return traversal(root);
    }
}