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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || k==0|| head.next==null)
            return head;

        int len=0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        k%=len;
        if(k==0)
            return head;
            
        temp = head;
        ListNode right=null;
        for(int i=0;i<len-k-1;i++){
            temp=temp.next;
        }
        right=temp.next;
        temp.next=null;
        temp=right;
        
        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        return right;
    }
}