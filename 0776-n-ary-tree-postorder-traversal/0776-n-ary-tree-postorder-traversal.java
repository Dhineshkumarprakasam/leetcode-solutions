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
}
*/

class Solution {
    void findpostorder(Node root, ArrayList<Integer> arr)
    {
        if(root!=null && root.children!=null)
            for(Node i : root.children)
                findpostorder(i,arr);

        if(root!=null)
            arr.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        findpostorder(root,ans);
        return ans;
    }
}