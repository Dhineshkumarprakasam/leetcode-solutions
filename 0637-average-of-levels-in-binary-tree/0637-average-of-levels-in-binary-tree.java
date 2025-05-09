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
    public List<Double> level(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> ans = new ArrayList<>();

        queue.offer(root);

        while(!queue.isEmpty())
        {
            Double sum=0.0;
            Double cnt=0.0;

            int qz = queue.size();
            for(int i=0;i<qz;i++)
            {
                TreeNode currNode = queue.poll();

                if(root==null)
                    break;

                sum+=currNode.val;
                cnt++;

                
                if(currNode.left!=null)
                    queue.offer(currNode.left);
                if(currNode.right!=null)
                    queue.offer(currNode.right);

                if(i==qz-1)
                {
                    Double avg = sum/cnt;
                    ans.add(avg);
                }
            }
           
        }

        return ans;
        
    }
    public List<Double> averageOfLevels(TreeNode root) {
        
        return level(root);
    }   
}