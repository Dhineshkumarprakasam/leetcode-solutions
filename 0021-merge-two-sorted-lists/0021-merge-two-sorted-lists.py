# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        lis=[]
        if list1==None and list2==None:
            return list1
        elif list1==None:
            return list2
        elif list2==None:
            return list1

        temp1=list1
        while temp1.next!=None:
            temp1=temp1.next

        temp1.next=list2

        temp1=list1
        while temp1!=None:
            lis.append(temp1.val)
            temp1=temp1.next
        
        lis.sort()
        index=0

        temp1=list1
        while temp1!=None:
            temp1.val=lis[index]
            index+=1
            temp1=temp1.next
        return list1


            
