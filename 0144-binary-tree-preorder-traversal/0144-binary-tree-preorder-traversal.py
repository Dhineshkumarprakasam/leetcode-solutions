# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.lis=[]
    
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if root!=None:
            self.lis.append(root.val)
            self.preorderTraversal(root.left)
            self.preorderTraversal(root.right)
        return self.lis
        