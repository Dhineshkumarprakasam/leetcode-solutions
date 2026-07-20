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
    void inorder(TreeNode *root){
        if(root==nullptr)
            return;
        
        if(root->left!=nullptr)
            inorder(root->left);
        ans.push_back(root->val);
        if(root->right!=nullptr)
            inorder(root->right);
    }
    TreeNode* increasingBST(TreeNode* root) {
        inorder(root);
        TreeNode *fin = new TreeNode(ans[0]);
        queue<TreeNode*> q;
        q.push(fin);

        int index=1;
        while(!q.empty()){
            TreeNode *curr = q.front();
            q.pop();
            if(index>=ans.size())
                break;
            curr->right = new TreeNode(ans[index++]);
            q.push(curr->right);
        }
        return fin;
    }
};