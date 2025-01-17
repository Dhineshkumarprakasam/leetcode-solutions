/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        set<ListNode*> a;

        ListNode *temp1=headA;
        while(temp1!=nullptr)
        {
            a.insert(temp1);
            temp1=temp1->next;
        }

        ListNode *temp2 = headB;
        while(temp2!=nullptr)
        {
            if(a.find(temp2)!=a.end())
                return temp2;
            else
                a.insert(temp2);
            temp2=temp2->next;
        }

        return nullptr;

            
    }
};