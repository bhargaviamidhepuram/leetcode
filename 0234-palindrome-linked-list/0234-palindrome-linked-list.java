/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverse(ListNode n){
        if(n == null){
            return n;
        }
        if(n.next == null){
            return n;
        }
        ListNode newnode = reverse(n.next);
        n.next.next = n;
        n.next = null;
        return newnode;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode s = head, f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        ListNode second = reverse(s.next);
        s.next = null;
        ListNode first = head;
        while(first != null && second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second =second.next;
        }
        return true;
    }
}