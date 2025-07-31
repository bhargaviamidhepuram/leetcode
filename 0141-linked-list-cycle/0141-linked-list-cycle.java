/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        HashSet<ListNode> hs  =  new HashSet<>();
        hs.add(head);
        //ListNode dummy = head;
        while(head.next != null){
            if(!hs.contains(head.next)){
                hs.add(head.next);
            }
            else{
                return true;
            }
            head = head.next;
        }
        return false;
    }
}