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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root==null)
            return new ArrayList<>();
        
        queue.offer(root);

        while(!queue.isEmpty())
        {
            int qz=queue.size();
            for(int i=0;i<qz;i++)
            {
                TreeNode curr = queue.poll();
                if(i==qz-1)
                    ans.add(curr.val);
                if(curr.left!=null)
                    queue.offer(curr.left);
                if(curr.right!=null)
                    queue.offer(curr.right);
            }
        }

        return ans;

    }
}