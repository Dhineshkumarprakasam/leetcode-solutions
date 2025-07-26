/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void inorder(TreeNode root, ArrayList<Integer> arr)
    {
        if(root.left!=null)
            inorder(root.left,arr);

        if(root!=null)
            arr.add(root.val);

        if(root.right!=null)
            inorder(root.right,arr);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);

        for(int i=1;i<arr.size();i++)
            if(arr.get(i-1)>=arr.get(i))
                return false;
        return true;

    }
}