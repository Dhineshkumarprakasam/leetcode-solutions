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
    vector<int> ans;
    void preorder(TreeNode* root)
    {
        if(root==nullptr)
            return;
        
        ans.push_back(root->val);
        if(root->left)
            preorder(root->left);
        if(root->right)
            preorder(root->right);
    }

    void flatten(TreeNode* root) {
        if(root==nullptr)
            return;
            
        preorder(root);
        TreeNode* curr=root;
        curr->val=ans[0];
        curr->left=nullptr;


        for(int i=1;i<ans.size();i++)
        {
            curr->right=new TreeNode(ans[i]);
            curr=curr->right;
        }

    }
};