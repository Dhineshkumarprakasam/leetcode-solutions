# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.s=0
    def inorder(self,root,low,high):
        if root:
            self.inorder(root.left,low,high)
            if root.val>=low and root.val<=high:
                self.s+=root.val
            self.inorder(root.right,low,high)
        

    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        self.inorder(root,low,high)
        return self.s
        