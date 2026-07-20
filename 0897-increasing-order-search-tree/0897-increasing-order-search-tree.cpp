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
    vector<int> arr;
    void inorder(TreeNode *root){
        if(root==nullptr)
            return;
        
        if(root->left!=nullptr)
            inorder(root->left);
        arr.push_back(root->val);
        if(root->right!=nullptr)
            inorder(root->right);
    }
    TreeNode* increasingBST(TreeNode* root) {
        inorder(root);
        TreeNode *ans = new TreeNode(arr[0]);
        queue<TreeNode*> q;
        q.push(ans);

        int index=1;
        while(!q.empty()){
            TreeNode *curr = q.front();
            q.pop();
            if(index>=arr.size())
                break;
            curr->right = new TreeNode(arr[index++]);
            q.push(curr->right);
        }
        return ans;
    }
};