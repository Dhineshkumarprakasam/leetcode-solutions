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
    void preorder_left(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            arr.add(null);
            return;
        }

        arr.add(root.val);  
        preorder_left(root.left,arr);
        preorder_left(root.right,arr);
    }
     void preorder_right(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            arr.add(null);
            return;
        }
        arr.add(root.val);
        preorder_right(root.right,arr);
        preorder_right(root.left,arr);

    }
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        if(root==null)
            return true;

        if(root.left!=null)
            preorder_left(root.left,arr1);

        if(root.right!=null)
            preorder_right(root.right,arr2);

        if(arr1.equals(arr2))
            return true;
        return false;
    }
}