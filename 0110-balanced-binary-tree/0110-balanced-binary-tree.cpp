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
    int height(TreeNode* root, int& maxi)
    {
        if(root==nullptr)
            return 0;
        
        int lh = height(root->left,maxi);
        int rh = height(root->right,maxi);

        maxi=max(lh+rh,maxi);

        return 1+max(lh,rh);
    }

    bool isBalanced(TreeNode* root) {
        if(root==nullptr)
            return true;
        if(root!=nullptr)
        {
            int maxi=0;
            int lh=height(root->left,maxi);
            int rh = height(root->right,maxi);

            if(abs(lh-rh)<=1 && isBalanced(root->left) && isBalanced(root->right))
                return true;
        }
        return false;
    }
};