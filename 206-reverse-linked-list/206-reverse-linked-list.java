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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }     
        
        ListNode last = head;
        ListNode mid = head.next;
        ListNode fore = head.next.next;
        
        while (fore != null) {
            mid.next = last;
            last = mid;
            mid = fore;
            fore = fore.next;
        }
        
        mid.next = last;
        head.next = null;
        
        return mid;
    }
}