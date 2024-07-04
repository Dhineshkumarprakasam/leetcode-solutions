# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        values=[]

        total=0
        temp=head
        while temp!=None:
            if temp.val==0:
                values.append(total)
                total=0
            else:
                total+=temp.val

            temp=temp.next

        temp=head
        values.pop(0)
        if len(values)==1:
            head.val=values[0]
            head.next=None
            return head
        
        for i in range(len(values)):
            temp.val=values[i]
            temp=temp.next
            if i==len(values)-2:
                temp.next=None

        return head
