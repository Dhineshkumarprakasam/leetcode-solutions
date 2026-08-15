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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode left = head;
        ListNode right = head.next;

        ListNode leftTemp = head;
        ListNode rightTemp = head.next;
        while(rightTemp!=null && rightTemp.next!=null){
            leftTemp.next = leftTemp.next.next;
            leftTemp=leftTemp.next;

            rightTemp.next = rightTemp.next.next;
            rightTemp=rightTemp.next;
        }

        leftTemp.next=right;
        return left;

    }
}