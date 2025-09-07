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
    static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newnode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newnode;
    }
    public void reorderList(ListNode head) {
        ListNode s = head, f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        ListNode first = head;
        ListNode second = reverse(s.next);
        s.next = null;
        while(second != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
        ListNode l = head;
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }
    }
}