# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if root:
            if val==root.val:
                return root
            elif val>root.val:
                found=self.searchBST(root.right,val)
                if found:
                    return found
            else:
                found=self.searchBST(root.left,val)
                if found:
                    return found
        else:
            return []
