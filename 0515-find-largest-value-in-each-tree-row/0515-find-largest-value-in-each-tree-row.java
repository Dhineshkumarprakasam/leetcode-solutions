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
    public List<Integer> largestValues(TreeNode root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null)
            return ans;
            
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);        

        while(!queue.isEmpty())
        {
            int qz = queue.size();
            int max = Integer.MIN_VALUE;

            for(int i=0;i<qz;i++)
            {
                TreeNode curr = queue.poll();
                max = Math.max(max,curr.val);
                if(curr.left!=null)
                    queue.offer(curr.left);
                if(curr.right!=null)
                    queue.offer(curr.right);
            }
            
            ans.add(max);
    
        }

        

        return ans;
    }
}