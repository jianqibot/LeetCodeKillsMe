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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ori = head;
        ListNode cur = head;
        
        while (cur != null) {
            if (cur.val == ori.val) {
                cur = cur.next;
            } else {
                ori.next = cur;
                ori = cur;
            }
        }
        
        if (ori != cur) {
            ori.next = null;
        }
        
        return head;
    }
}