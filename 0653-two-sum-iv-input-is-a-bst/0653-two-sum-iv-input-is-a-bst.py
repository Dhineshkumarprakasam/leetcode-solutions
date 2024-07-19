# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.ls=[]
    def inorder(self,root):
        if root:
            self.inorder(root.left)
            self.ls.append(root.val)
            self.inorder(root.right)

    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        self.inorder(root)
        for i in range(len(self.ls)):
            if(k-self.ls[i] in self.ls and self.ls.index(k-self.ls[i])!=i):
                return True
        return False


        