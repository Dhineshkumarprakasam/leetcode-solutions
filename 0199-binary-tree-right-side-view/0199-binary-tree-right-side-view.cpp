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
    vector<int> rightSideView(TreeNode* root) {


        queue<TreeNode*> q;
        vector<int> ans;

        if(root==nullptr)
            return ans;
        q.push(root);

        while(!q.empty())
        {
            int qz = q.size();
            for(int i=0;i<qz;i++)
            {
                TreeNode *currNode = q.front();
                q.pop();

                if(i==qz-1)
                    ans.push_back(currNode->val);
                
                if(currNode->left!=nullptr)
                    q.push(currNode->left);
                if(currNode->right!=nullptr)
                    q.push(currNode->right);
            }
        }

        return ans;
        
    }
};