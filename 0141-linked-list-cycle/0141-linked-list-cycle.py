# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        a=[]

        temp=head
        while(temp!=None):
            add=id(temp)
            if  add not in a:
                a.append(add)
            else:
                return True
            temp=temp.next
        
        return False