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
    public boolean isPalindrome(ListNode head) {
        
        if (head.next == null) {
            return true;
        }
        // find middle point
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        } 
        
        if (fast != null) {
            slow = slow.next;
        }
        
        // reverse list starting from slow
        ListNode newHead = reverse(slow);
        
        // compare
        while (newHead != null) {
            if (head.val != newHead.val) {
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        
        return true;
    }
    
    
    
    public ListNode reverse(ListNode head) {
        
        ListNode ori = head;
        ListNode cur = head.next;
        ListNode next;
        ori.next = null;
        
        while(cur != null) {
            next = cur.next;
            cur.next = ori;
            ori = cur;
            cur = next;
        }
        
        return ori;
    }
}