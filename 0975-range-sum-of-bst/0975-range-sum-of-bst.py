# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.li=[]
    def inorder(self,root):
        if root:
            self.inorder(root.left)
            self.li.append(root.val)
            self.inorder(root.right)
        

    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        self.inorder(root)
        s=0
        for i in self.li:
            if i>=low and i<=high:
                s+=i
        return s

        