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
    int ans=0;
    vector<TreeNode*> allNodes;
    void inorder(TreeNode* root){
        if(root==nullptr)
            return;
        if(root->left!=nullptr)
            inorder(root->left);
        allNodes.push_back(root);
        if(root->right!=nullptr)
            inorder(root->right);
    }

    int maxi(TreeNode *root,int maxVal){
        if(root==nullptr)
            return maxVal;

        if(root->left!=nullptr){
            maxVal = maxi(root->left,max(root->val,maxVal));
        }
            maxVal = max(maxVal,root->val);

        if(root->right!=nullptr)
            maxVal = maxi(root->right,max(root->val,maxVal));
        
        return maxVal;
    }

    int countDominantNodes(TreeNode* root) {
        inorder(root);
        for(int i=0;i<allNodes.size();i++){
            int val = allNodes[i]->val;
            int maxVal = maxi(allNodes[i],val);
            if(val==maxVal)
                ans++;
        }
        return ans;
    }
};