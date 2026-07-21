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
class BSTIterator {
public:
    vector<int> arr;
    int curr = 0;
    void preorder(TreeNode *root){
        if(root==nullptr)
            return;
        if(root->left!=nullptr)
            preorder(root->left);
        arr.push_back(root->val);
        if(root->right!=nullptr)
            preorder(root->right);
    }

    BSTIterator(TreeNode* root) {
        preorder(root);
    }
    
    int next() {
        return arr[curr++];
    }
    
    bool hasNext() {
        if(curr<arr.size())
            return true;
        return false;
    }
};

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator* obj = new BSTIterator(root);
 * int param_1 = obj->next();
 * bool param_2 = obj->hasNext();
 */