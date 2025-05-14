# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int:
        q=[root]
        ans=0

        if root==None:
            return ans
            
        while len(q)>0:
            qz=len(q)
            for i in range(qz):
                curr = q.pop(0)
                ans+=1
                
                if curr.left!=None:
                    q.append(curr.left)
                if curr.right!=None:
                    q.append(curr.right)
        return ans
            

        