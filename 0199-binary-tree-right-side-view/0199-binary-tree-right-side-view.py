# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        q=[]
        ans=[]

        if root==None:
            return ans
        
        q.append(root)

        while(len(q)>0):

            qz=len(q)

            for i in range(0,len(q)):
                currNode = q.pop(0)
                if i==qz-1:
                    ans.append(currNode.val)
                if(currNode.left!=None):
                    q.append(currNode.left)
                if(currNode.right!=None):
                    q.append(currNode.right)

        return ans