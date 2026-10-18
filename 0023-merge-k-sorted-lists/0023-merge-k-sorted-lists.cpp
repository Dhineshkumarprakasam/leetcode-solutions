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
    bool hasElements(vector<ListNode*>& lists){
        for(int i=0;i<lists.size();i++){
            if(lists[i]!=nullptr)
                return true;
        }
        return false;
    }

    ListNode* mergeKLists(vector<ListNode*>& lists) {
        int n = lists.size();
        if(n==0)
            return nullptr;

        ListNode *ans=new ListNode(-1);
        ListNode *temp=ans;
        
        while(hasElements(lists)){
            ListNode *min=nullptr;
            int idx;
            
            for(int i=0;i<n;i++){
                if(min==nullptr || (lists[i]!=nullptr && lists[i]->val < min->val)){
                    min=lists[i];
                    idx=i;
                }
            }

            lists[idx]=lists[idx]->next;
            temp->next=min;
            temp=temp->next;
        }

        return ans->next;
    }
};