/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public static void pre(Node root, List<Integer> l){
        if(root == null){
            return;
        }
        l.add(root.val);
        if (root.children != null) {
            for (Node child : root.children) {
                pre(child, l);
            }
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> l = new ArrayList<Integer>();
        pre(root, l);
        return l;
    }
}