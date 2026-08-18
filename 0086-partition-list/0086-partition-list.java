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
        ListNode first = new ListNode(-1,null);
        ListNode itFirst = first;

        ListNode second= new ListNode(-1,null);
        ListNode itSecond = second;

        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                itFirst.next = temp;
                itFirst=itFirst.next;
            }
            else{
                itSecond.next = temp;
                itSecond=itSecond.next;
            }
            temp=temp.next;
        }

        
        itSecond.next=null;
        itFirst.next=second.next;
        return first.next;
    }
}