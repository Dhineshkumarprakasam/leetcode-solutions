# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        arr =[]
        length=0

        if head==None:
            return None

        temp = head
        while temp!=None:
            arr.append(temp.val)
            length+=1
            temp=temp.next
        

        k=k%length
        for i in range(k):
            x = arr.pop(-1)
            arr.insert(0,x)
        
        temp=head
        idx=0
        while temp!=None:
            temp.val=arr[idx]
            temp=temp.next
            idx+=1
        
        return head
