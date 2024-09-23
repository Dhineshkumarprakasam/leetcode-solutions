/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        vector<int> arr;

        ListNode *temp=head;
        while(temp->next!=nullptr)
        {
            arr.push_back(temp->val);
            temp=temp->next;
        }
        arr.push_back(temp->val);

        int l=0;
        int h=arr.size()-1;
        while(l<=h)
        {
            if(arr[l]!=arr[h])
                return false;
            l++;
            h--;
        }
        return true;
    }
};