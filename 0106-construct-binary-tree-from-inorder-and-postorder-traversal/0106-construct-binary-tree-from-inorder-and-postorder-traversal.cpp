/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int postIndex=0;
    unordered_map<int,int> map;

    TreeNode* helper(vector<int>&postorder, int left, int right){
        if(left>right)
            return nullptr;
        
        int rootval = postorder[postIndex--];
        TreeNode *root = new TreeNode(rootval);

        int mid = map[rootval];
        root->right = helper(postorder,mid+1,right);
        root->left = helper(postorder,left,mid-1);
        return root;
    }

    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        postIndex=inorder.size()-1;

        for(int i=0;i<inorder.size();i++)
            map[inorder[i]]=i;
        
        TreeNode* root = helper(postorder,0,inorder.size()-1);
        return root;
    }
};