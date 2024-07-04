# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        st=""
        temp=l1
        while temp!=None:
            st+=str(temp.val)
            temp=temp.next

        st+='+'

        temp=l2
        while temp!=None:
            st+=str(temp.val)
            temp=temp.next
        
        st=st[::-1]
        st=eval(st)

        dummy=ListNode()
        temp = dummy
        if st==0:
            return dummy
        
        while st >0:
            temp.next = ListNode(st % 10)
            temp = temp.next
            st = st // 10
        

        return dummy.next
