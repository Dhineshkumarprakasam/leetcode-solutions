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
    public ListNode sortList(ListNode head) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode i=head;i!=null;i=i.next)
            arr.add(i.val);
        
        Collections.sort(arr);

        int index=0;
        for(ListNode i=head;i!=null;i=i.next)
        {
            i.val=arr.get(index);
            index++;
        }
        return head;
    }
}