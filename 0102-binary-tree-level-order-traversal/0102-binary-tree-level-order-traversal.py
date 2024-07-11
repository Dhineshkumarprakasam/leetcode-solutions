# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.answer=[]
        self.arr=[]
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root==None:
            return self.answer
        self.arr.append(root)
        while(len(self.arr)>0):
            lev=[]
            for i in range(0,len(self.arr)):
                node=TreeNode()
                node=self.arr[0]
                self.arr.pop(0)
                if node.left !=None:
                    self.arr.append(node.left)
                if node.right!=None:
                    self.arr.append(node.right)
                lev.append(node.val)
            self.answer.append(lev)
        return self.answer