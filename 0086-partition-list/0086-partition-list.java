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

        ListNode left=new ListNode(-1);
        ListNode right=new ListNode(-1);

        ListNode leftTemp=left;
        ListNode rightTemp=right;

        while(head!=null){
            if(head.val<x){
                leftTemp.next=head;
                leftTemp=leftTemp.next;
            }
            else{
                rightTemp.next=head;
                rightTemp=rightTemp.next;
            }
            head=head.next;
        }
        rightTemp.next=null;
        leftTemp.next=right.next;
        return left.next;
    }
}