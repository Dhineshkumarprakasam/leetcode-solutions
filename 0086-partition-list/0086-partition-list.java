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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);

        ListNode leftTemp=left;
        ListNode rightTemp=right;

        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                leftTemp.next=temp;
                leftTemp=leftTemp.next;
            }
            else{
                rightTemp.next=temp;
                rightTemp=rightTemp.next;
            }
            temp=temp.next;
        }

        leftTemp.next=right.next;
        rightTemp.next=null;
        return left.next;
    }
}