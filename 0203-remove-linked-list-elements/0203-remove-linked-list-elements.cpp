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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* n=nullptr;
        ListNode *ntemp=nullptr;


        ListNode* temp=head;
        while(temp!=nullptr)
        {
            if(temp->val!=val && n==nullptr)
            {
                n=temp;
                ntemp=n;
            }
            else if(temp->val!=val)
            {
                ntemp->next=temp;
                ntemp=ntemp->next;
            }
            temp=temp->next;
        }
        if(ntemp!=nullptr && ntemp->next!=nullptr)
            ntemp->next=nullptr;
        return n;
    }
};