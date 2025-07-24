/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if(root!=null)
            queue.offer(root);

        while(!queue.isEmpty())
        {
            ArrayList<Integer> level = new ArrayList<>();
            int qz=queue.size();
            for(int i=0;i<qz;i++)
            {
                Node currNode = queue.poll();
                level.add(currNode.val);
                if(currNode!=null && currNode.children!=null)
                    for(Node j : currNode.children)
                            queue.offer(j);
            }

            ans.add(level);
        }

        return ans;
    }
}