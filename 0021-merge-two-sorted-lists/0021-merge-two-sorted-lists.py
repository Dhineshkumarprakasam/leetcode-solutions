# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:

        ans=None
        tail=None
        while(list1 is not None and list2 is not None):
            if list1.val<list2.val:
                if ans is None:
                    ans = ListNode(list1.val)
                    tail=ans
                else:
                    tail.next=ListNode(list1.val)
                    tail=tail.next
                list1=list1.next
            
            else:
                if ans is None:
                    ans = ListNode(list2.val)
                    tail=ans
                else:
                    tail.next=ListNode(list2.val)
                    tail=tail.next
                list2=list2.next
        
        while list1 is not None:
            if ans is None:
                ans = ListNode(list1.val)
                tail=ans
            else:
                tail.next=ListNode(list1.val)
                tail=tail.next
            list1=list1.next
        
        while list2 is not None:
            if ans is None:
                ans = ListNode(list2.val)
                tail=ans
            else:
                tail.next=ListNode(list2.val)
                tail=tail.next
            list2=list2.next
        
        return ans
            

