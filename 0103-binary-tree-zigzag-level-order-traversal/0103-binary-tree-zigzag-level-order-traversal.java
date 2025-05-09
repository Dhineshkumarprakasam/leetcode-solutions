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
    public List<List<Integer>> level(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> level = new ArrayList<>(); 

            int qz = queue.size();
            for(int i=0;i<qz;i++)
            {
                TreeNode currNode = queue.poll();

                if(root==null)
                    break;

                level.add(currNode.val);
                
                if(currNode.left!=null)
                    queue.offer(currNode.left);
                if(currNode.right!=null)
                    queue.offer(currNode.right);

                if(i==qz-1)
                     ans.add(level);
            }
           
        }

        for(int i=0;i<ans.size();i++)
        {
            if(i%2!=0)
                Collections.reverse(ans.get(i));
        }
        return ans;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return level(root);
    }
}