# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        queue=[]
        final=[]
        queue.append(root)
        while len(queue)>0:
            level = []
            for i in range(len(queue)):
                if queue[0] is not None:
                    if queue[0].left is not None:
                        queue.append(queue[0].left)
                    if queue[0].right is not None:
                        queue.append(queue[0].right)
                    level.append(queue[0].val)
                queue.pop(0)
            if len(level)>0:
                final.append(level)
        return final

