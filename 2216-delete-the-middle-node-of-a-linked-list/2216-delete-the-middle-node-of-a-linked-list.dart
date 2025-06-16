/**
 * Definition for singly-linked list.
 * class ListNode {
 *   int val;
 *   ListNode? next;
 *   ListNode([this.val = 0, this.next]);
 * }
 */
class Solution {
  ListNode? deleteMiddle(ListNode? head) {

    ListNode? temp = head;
    int length=0;
    while(temp!=null)
    {
        length++;
        temp=temp.next;
    }

    if(length==1)
        return null;
    temp = head;
    int till = length ~/ 2;
    for(int i=0;i<till-1;i++){

        temp=temp?.next;
    }

    temp?.next = temp?.next?.next;

    return head;
    
  }
}