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
    public ArrayList<TreeNode> inorder(TreeNode root, ArrayList<TreeNode> arr)
    {
        if(root==null)
            return arr;
    
        if(root.left!=null)
            inorder(root.left,arr);

        arr.add(root);

        if(root.right!=null)
            inorder(root.right,arr);
        
        return arr;
    }

    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> arr = inorder(root,new ArrayList<>());

        TreeNode first=null;
        TreeNode last=null;

        int len=arr.size();
        for(int i=0;i<len-1;i++)
        {
            if(arr.get(i).val > arr.get(i+1).val)
            {
                if(first==null)
                    first=arr.get(i);
                last=arr.get(i+1);
            }
        }

        if(first!=null && last!=null)
        {
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
        }
    }
}