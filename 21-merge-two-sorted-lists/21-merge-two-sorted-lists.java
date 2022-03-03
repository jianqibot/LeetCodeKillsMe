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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode p = dummy;
        
        while(head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                p.next = head1;
                p = p.next;
                head1 = head1.next;
            } else {
                p.next = head2;
                p = p.next;
                head2 = head2.next;
            }
        }
        
        if (head1 == null) {
            p.next = head2;
        }
        
        if (head2 == null) {
            p.next = head1;
        }
        
        return dummy.next; 
    }
}