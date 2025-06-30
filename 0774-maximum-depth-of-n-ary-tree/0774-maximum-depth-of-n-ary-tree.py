"""
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children
"""

class Solution:
    def maxDepth(self, root: 'Node') -> int:

        if root==None:
            return 0
            
        tree=[]

        queue=[root]

        while len(queue)>0:
            level=[]
            for i in range(len(queue)):
                currNode = queue.pop(0)
                level.append(currNode.val)
                
                if(currNode.children!=None):
                    for i in currNode.children:
                        queue.append(i)
            tree.append(level)
        return len(tree)
            
           


            
