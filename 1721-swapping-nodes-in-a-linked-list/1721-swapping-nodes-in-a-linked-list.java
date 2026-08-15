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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode begin = head;
        for(int i=0;i<k-1;i++)
            begin=begin.next;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=0;i<k;i++)
            fast=fast.next;

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        int temp = begin.val;
        begin.val = slow.val;
        slow.val=temp;

        return dummy.next;
    }
}