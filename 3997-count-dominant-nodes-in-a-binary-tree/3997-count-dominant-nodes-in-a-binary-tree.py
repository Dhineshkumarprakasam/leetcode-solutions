# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def __init__(self):
        self.ans = 0
        self.allNodes = []

    def inorder(self, root: TreeNode) -> None:
        if root is None:
            return
        if root.left is not None:
            self.inorder(root.left)
        self.allNodes.append(root)
        if root.right is not None:
            self.inorder(root.right)

    def maxi(self, root: TreeNode, maxVal: int) -> int:
        if root is None:
            return maxVal

        if root.left is not None:
            maxVal = self.maxi(root.left, max(root.val, maxVal))
        
        maxVal = max(maxVal, root.val)

        if root.right is not None:
            maxVal = self.maxi(root.right, max(root.val, maxVal))
        
        return maxVal

    def countDominantNodes(self, root: TreeNode) -> int:
        self.inorder(root)
        for i in range(len(self.allNodes)):
            val = self.allNodes[i].val
            maxVal = self.maxi(self.allNodes[i], val)
            if val == maxVal:
                self.ans += 1
        return self.ans