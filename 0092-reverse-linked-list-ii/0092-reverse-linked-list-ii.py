# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:

        #reach the first part
        start=head
        for i in range(left-1):
            start=start.next

        #iterate elements from start to end
        temp=start
        elements=[]
        for i in range(left,right+1):
            elements.append(temp.val)
            temp=temp.next
         

        #iterate and fill reverse
        temp=start
        for i in elements[::-1]:
            temp.val=i
            temp=temp.next
        
        return head

        



            
        