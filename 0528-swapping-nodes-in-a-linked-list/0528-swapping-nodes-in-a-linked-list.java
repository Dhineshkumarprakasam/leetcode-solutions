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
        
        ListNode temp=head;
        int total=0;
        while(temp!=null)
        {
            temp=temp.next;
            total++;
        }

        int back=total-k+1;

        ListNode first=head;
        for(int i=0;i<k-1;i++)
            first=first.next;
        
        ListNode last=head;
        for(int i=0;i<back-1;i++)
            last=last.next;

        int t=first.val;
        first.val=last.val;
        last.val=t;

        return head;
    }
}