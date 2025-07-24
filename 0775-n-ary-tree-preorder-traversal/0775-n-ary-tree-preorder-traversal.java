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
    void findpreorder(Node root, ArrayList<Integer> arr)
    {
        if(root!=null)
            arr.add(root.val);
        
        if(root!=null && root.children!=null)
            for(Node i : root.children)
                findpreorder(i,arr);
    }

    public List<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        findpreorder(root,ans);
        return ans;
    }
}