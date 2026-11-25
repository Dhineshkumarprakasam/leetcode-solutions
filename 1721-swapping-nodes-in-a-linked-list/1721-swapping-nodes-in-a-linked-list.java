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
        int n=0;

        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }

        ListNode first=head;
        for(int i=0;i<k-1;i++){
            first=first.next;
        }

        ListNode second=head;
        for(int i=0;i<n-k;i++){
            second=second.next;
        }

        int t = first.val;
        first.val=second.val;
        second.val=t;

        return head;
    }
}