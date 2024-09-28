# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.lis=[]
    def levelorder(self,root):
        queue=[]
        queue.append(root)
        while len(queue)>0:
            level=[]
            for i in range(len(queue)):
                if queue[0].right:
                    queue.append(queue[0].right)
                if queue[0].left:
                    queue.append(queue[0].left)
                level.append(queue[0].val)
                queue.pop(0)
            self.lis.append(level)
        
                

    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        self.levelorder(root)
        return sum(self.lis[-1])