# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        even=None
        even_tail=None
        odd=None
        odd_tail=None

        temp=head
        index=0
        while(temp!=None):
            if(index%2==0):
                if even==None:
                    even=temp
                    even_tail=temp
                else:
                    even_tail.next=temp
                    even_tail=even_tail.next
            
            else:
                if odd==None:
                    odd=temp
                    odd_tail=temp
                else:
                    odd_tail.next=temp
                    odd_tail=odd_tail.next
            index+=1
            temp=temp.next
        
        if even_tail:
            even_tail.next=odd
        else:
            even=odd

        if odd_tail:   
            odd_tail.next=None

        return even
