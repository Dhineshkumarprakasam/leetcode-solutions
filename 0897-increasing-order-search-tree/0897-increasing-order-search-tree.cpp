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
        queue<TreeNode*> q;
        root->val=arr[0];
        root->left=nullptr;
        q.push(root);

        int index=1;
        while(!q.empty()){
            TreeNode *curr = q.front();
            q.pop();
            if(index>=arr.size())
                break;
            if(curr->right==nullptr)
                curr->right = new TreeNode(arr[index++]);
            else{
                curr->right->val=arr[index++];
            }
            curr->left = nullptr;
            q.push(curr->right);
        }
        return root;
    }
};